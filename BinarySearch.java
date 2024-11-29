import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args)
    {
        int[] arr = {10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40};
        System.out.println("Initial array is : "+ Arrays.toString(arr));
        System.out.println("Length of this array is : "+(arr.length-1));
        int target = 42;

        int ans = findElementBinarySearch(arr, target);
        System.out.println("Element found at : "+ans);
    }

    public static int findElementBinarySearch(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end)
        {
            int mid = (start + end) / 2;

            if(arr[mid] == target)
            {
                return mid;
            }
            else if(target < arr[mid])
            {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
