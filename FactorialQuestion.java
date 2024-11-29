public class FactorialQuestion {
    public static void main(String[] args) {
        int ans = fact(8);
        System.out.println(ans);
    }

    public static int fact(int n)
    {
        if(n==1)
        {
            return 1;
        }

        return n * fact(n-1);
    }
}
