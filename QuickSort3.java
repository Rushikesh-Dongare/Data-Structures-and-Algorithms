import java.util.Arrays;

public class QuickSort3 {
    public static void main(String[] args) {
        int[] arr = {90,70,50,120,150,12,60,458,22,22,10,7,6,8,4,2,0};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int low, int high)
    {
        if(low >= high)
        {
            return;
        }

        int start = low, end = high;
        int mid = start + (end - start)/2;
        int piovit = arr[mid];

        while(start <= end)
        {
            while(arr[start] < piovit)
            {
                start++;
            }

            while(arr[end] > piovit)
            {
                end--;
            }

            if(start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }

            quickSort(arr, low, end);
            quickSort(arr, start, high);
        }
    }

    static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
