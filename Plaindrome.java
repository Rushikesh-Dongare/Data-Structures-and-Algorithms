public class Plaindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1234));
    }

    static boolean isPalindrome(int a)
    {
        int rev = reverse1(a);

        if(a == rev)
        {
            return true;
        }
        return false;
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
