public class SumOfDigits {
    public static void main(String[] args) {
        int a = SOD(450811);
        System.out.println(a);
    }

    private static int SOD(int n) {
        if(n == 0)
        {
            return 0;
        }

        return n%10 + SOD(n/10);
    }


}
