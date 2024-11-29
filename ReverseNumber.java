public class ReverseNumber {
    static int rev = 0;
    static void reverseNumber2(int a)
    {
        if(a == 0)
        {
            return;
        }
        int rem = a%10;
        rev = rev * 10 + rem;
        reverseNumber2(a/10);
    }

    public static void main(String[] args) {
        int ans = reverse1(456);
        System.out.println(ans);
    }

    static int reverseNumber(int a)
    {
        int ans = 0;
        while(a > 0)
        {
            ans += (a%10);
            a /= 10;
            ans *= 10;
        }
        return ans;
    }

    static int reverse1(int a)
    {
        int digits = (int) ((Math.log10(a)) + 1);

        return helper(a, digits);
    }

    static int helper(int a, int digits)
    {
        if(a%10 == 0)
        {
            return a;
        }
        int rem = a%10;
        return rem * (int)Math.pow(10, digits - 1) + helper(a/10, digits-1);
    }

}
