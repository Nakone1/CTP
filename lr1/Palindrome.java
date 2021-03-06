public class Palindrome
{
    public static String reverseString(String s)// метод возвращает перевёрнутую строку s
    {
        String rev = "";
        int len = s.length();
        for (int i = 0; i < len; i++)
            rev += s.charAt(len - i - 1);
        return (rev);
    }
    
    public static boolean isPalindrome(String s)// метод возвращет значение true в случае, если строка s является палиндромом, false если нет.
    {
        String rev = reverseString(s);
        return ((s.equals(rev)) ? true : false);
    }
    
    public static void main(String[] args)// метод показывает является ли строка палиндромом
    {
        for (int i = 0; i < args.length; i++)
        {
            String s = args[i];
            System.out.println(isPalindrome(s));
        }
    }
}