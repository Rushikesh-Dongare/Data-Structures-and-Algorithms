public class RecurssionQuestion1 {
    public static void main(String[] args)
    {
        int n = 5;
        System.out.println("Ascending Order : ");
        displayAscending(n);
        System.out.println();
        System.out.println("Decending Order : ");
        displayAscending(n);
        System.out.println();
        System.out.println("Both Order : ");
        displayBoth(n);
    }

    public static void displayDescending(int n)
    {
        if(n == 1)
        {
            System.out.print(n);
            return;
        }
        System.out.print(n+"\t");
        displayDescending(n-1);
    }

    public static void displayAscending(int n)
    {
        if(n == 1)
        {
            System.out.println(n);
            return;
        }
        System.out.print(n+"\t");
        displayDescending(n-1);
    }

    public static void displayBoth(int n)
    {
        if(n == 0)
        {
            System.out.println();
            return;
        }
        System.out.print(n+"\t");
        displayBoth(n-1);
        System.out.print(n+"\t");
    }
}
