public class Recurssion1 {
    public static void main(String[] args)
    {
        displayNumber(1);
    }

    public static void displayNumber(int a)
    {
        System.out.println(a);
        displayNumber1(2);
    }
    public static void displayNumber1(int a)
    {
        System.out.println(a);
        displayNumber3(3);
    }
    public static void displayNumber3(int a)
    {
        System.out.println(a);
        displayNumber4(4);
    }
    public static void displayNumber4(int a)
    {
        System.out.println(a);
        displayNumber5(5);
    }
    public static void displayNumber5(int a)
    {
        System.out.println(a);
    }

}
