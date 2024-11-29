public class Factorial {
    public static void main(String[] args)
    {
        System.out.println(fact(10));
    }

    public static int fact(int a)
    {
        if(a == 1)
        {
            return 1;
        }
        System.out.println(a);
        return  a * fact(a-1);
    }
}
