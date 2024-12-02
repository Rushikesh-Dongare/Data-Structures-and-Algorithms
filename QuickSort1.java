import java.util.Arrays;

public class QuickSort1 {
    public static void main(String[] args) {
        int[] arr = {50,20,10,45,65,78,95,56,75,72,80};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
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

            while (arr[end] > piovit)
            {
                end--;
            }

            if(start <= end)
            {
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        quickSort(arr, low, end);
        quickSort(arr, start, high);
    }

    static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
