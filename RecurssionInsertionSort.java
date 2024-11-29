import java.util.Arrays;

public class RecurssionInsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr, int end, int times)
    {

    }

    static void insertionSort(int [] arr)
    {
        int max = 0, length = arr.length;
       for(int i=0; i<length-1; i++)
       {
           if(arr[i] > max)
           {
               swap(arr, i, length-1);
           }
       }
    }

    static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
