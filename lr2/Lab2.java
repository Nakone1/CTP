public class Lab2
{
	public static double computeArea(Point3d a, Point3d b, Point3d c)
	{
		double lena = Math.abs(a.distanceTo(b));
		double lenb = Math.abs(b.distanceTo(c));
		double lenc = Math.abs(c.distanceTo(a)); 
		double p = (lena + lenb + lenc) / 2;
		return (Math.sqrt(p*(p - lena) * (p - lenb) * (p - lenc)));
	}

 	public static void main(String[] args)
	{
		Point3d a = new Point3d(2, 2, 0);
		Point3d b = new Point3d(1, 1, 0);
		Point3d c = new Point3d(1, 0, 0);

		if (a.compare(b) || a.compare(c) || c.compare(b))
			System.out.println("Incorrect coordinates");
		else
			System.out.printf("%.2f", computeArea(a, b, c));

	}
}