public class Factors {
    public static void main(String[] args)
    {
        int a = 20;
        factors(a);
//        Math.
    }

    public static void factors(int a)
    {
        for(int i=1; i<=Math.sqrt(20); i++)
        {
            if(a%i == 0)
            {
                System.out.println(i+ " "+ a/i);
            }
        }
    }

}
