import java.awt.geom.Rectangle2D;

public class BurningShip extends FractalGenerator
{
	 public static final int MAX_ITERATIONS = 2000;

	/** Метод, позволяющий генератору фракталов определить наиболее «интересную»
	 * 	область комплексной плоскости для конкретного фрактала */
    public void getInitialRange(Rectangle2D.Double range) 
    {
	    range.x = -2;
	    range.y = -2.5;
	    range.height = 4;
	    range.width = 4;
	}
	/** Метод реализует итеративную функцию для фрактала Burning Ship */
    public int numIterations(double x, double y) 
    {
	    double x1 = 0;
        double y1 = 0;
		double x2;
		double y2;
        for(int i = 0; i < MAX_ITERATIONS; i++)
        {
	        x2 = x1 * x1 - y1 * y1 + x; 
	        y2 =2 * Math.abs(x1) * Math.abs(y1) + y;
	        x1 = x2;
	        y1 = y2;
            if (x1 * x1 + y1 * y1 > 4)
	            return i; 
	    }
	    return -1;
	}
	 public String toString() {
        return "Burning Ship";
    }
}