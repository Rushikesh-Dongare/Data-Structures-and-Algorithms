import java.util.Arrays;

public class RecurssionBubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println("Before Sorting: "+Arrays.toString(arr));
        bubbleSort(arr, 0, 0);
        System.out.println("After Sorting: "+Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr, int start, int times)
    {
        if(start == arr.length-1)
        {
            return;
        }
        if(times < arr.length)
        {
            if(arr[start] < arr[start + 1])
            {
                bubbleSort(arr, start+1, times);
            }
            else {
                int temp = arr[start];
                arr[start] = arr[start+1];
                arr[start+1] = temp;

                bubbleSort(arr, start+1, times);
            }
            bubbleSort(arr, 0, ++times);
        }



    }
}
