import java.util.Arrays;

public class BullleSort1 {
    public static void main(String[] args)
    {
        int[] arr = {5,4,3,2,1};

        System.out.println("Array before the sorting : "+ Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr)
    {
        boolean swapped;
        for(int i=0; i<arr.length; i++)
        {
            swapped = false;
            for(int j=1; j<arr.length-i; j++)
            {
                if(arr[j] < arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
            {
                break;
            }
        }


    }

    public static int[] swap(int a, int b)
    {
        int temp;
        temp = a;
        a = b;
        b = temp;
        return new int[] {a, b};
    }

}
