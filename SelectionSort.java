import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args)
    {
        int[] arr = {5,4,3,2,1,0};
       selectionSort(arr);
    }

    public static void selectionSort(int[] arr)
    {
        int end = arr.length-1;
        for(int i=0; i<arr.length; i++)
        {
            int ans = findMax(arr, end);
            System.out.println(ans);
            int temp = arr[end];
            arr[end] = arr[ans];
            arr[ans] = temp;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int findMax(int[] arr, int end)
    {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for(int i=0; i<=end; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
                index++;
            }
        }
        return index;
    }
}
