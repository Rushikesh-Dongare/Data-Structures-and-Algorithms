//import javax.swing.*;

public class PrimeNumber {
    public static void main(String[] args)
    {
        int a = 40;
        for(int i=1; i<=a; i++)
        {
            if(isPrime(i))
            {
                System.out.print(i+"\t");
            }
        }
    }

    public static boolean isPrime(int a)
    {
        int c = 2;
        while (c * c <= a)
        {
            if(a%c == 0)
            {
                return false;
            }
            c++;
        }
        return true;
    }
}
