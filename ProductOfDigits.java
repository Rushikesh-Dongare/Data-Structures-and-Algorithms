public class ProductOfDigits {
    public static void main(String[] args) {
        int ans = POD(4239);
        System.out.println(ans);
    }

    static int POD(int n) {
        if (n%10 == n)
        {
            return n;
        }

        return (n%10) * POD(n/10);
    }
}
