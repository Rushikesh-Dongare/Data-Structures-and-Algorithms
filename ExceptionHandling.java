public class ExceptionHandling {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};

        try{
            displyArray(arr);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch (ArithmeticException a)
        {
            System.out.println(a);
        }
        System.out.println();
        System.out.println("This is after exception");
    }

    public static void displyArray(int[] arr) throws ArrayIndexOutOfBoundsException, ArithmeticException
    {
            System.out.println("Length of the array : "+arr.length);
            int a = 10 / 0;
            System.out.println(arr[10]);
            System.out.println(a);
    }
}
