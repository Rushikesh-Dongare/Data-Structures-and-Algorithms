public class Recurssion2 {
    public static void main(String[] args)
    {
        displayNumber(1);

    }

    public static void displayNumber(int a)
    {
        if(a == 5)
        {
            System.out.print(a);
            return;
        }
        System.out.print(a+"\t");
        displayNumber(a+1);
    }
}
