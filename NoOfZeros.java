public class NoOfZeros {
    public static void main(String[] args) {
        int ans = helper(3000004, 0);
        System.out.println(ans);
    }

    static int helper(int a, int zeros)
    {
        if(a == 0)
        {
            return zeros;
        }
        if(a%10 == 0)
        {
            return helper(a/10,zeros+1);
        }
        else
        {
            return helper(a/10, zeros);
        }
    }
}
