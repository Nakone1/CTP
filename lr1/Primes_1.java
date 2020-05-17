public class Primes
{
    public static boolean isPrime(int n)//метод возвращает truе если число является простым , false, если нет
    {
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return(false);
        return (true);
        
    }
    public static void main(String[] args)//метод выводит на экран список простых чисел меньших 100
    {
        for (int a = 1; a < 101; a++)
            if (isPrime(a))
                System.out.println(a);
    }
}
