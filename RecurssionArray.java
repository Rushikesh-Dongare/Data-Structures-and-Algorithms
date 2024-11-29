public class RecurssionArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        printArray(arr);
    }

    static void printArray(int[] arr)
    {
        printNumber(arr, 0);
    }

    static void printNumber(int[] arr, int index)
    {
        if(index == arr.length-1)
        {
            System.out.print(arr[index]+"\t");
            return;
        }

        System.out.print(arr[index]+"\t");
        printNumber(arr, ++index);
    }
}
