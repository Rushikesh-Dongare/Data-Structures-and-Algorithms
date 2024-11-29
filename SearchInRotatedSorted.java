public class SearchInRotatedSorted {
    public static void main(String[] args)
    {
        int[] arr = {3,4,5,6,7,0,1,2};
        int max = findMax(arr);
        System.out.println("Max Found at : "+max);
        System.out.println("Max Element is : "+arr[max]);
        int target = 1;
        int ans = binarySearch(arr, target, 0, max);
        if(ans == -1)
        {
            ans = binarySearch(arr, target, max+1, arr.length-1);
        }
        System.out.println("Element found at : "+ans);
        System.out.println("Element is : "+arr[ans]);
    }

    public static int findMax(int[] arr)
    {
        int start = 0, end = arr.length-1, mid = 0;

        while (start <= end)
        {
            mid = start + (end - start)/2;
            if(mid < end && arr[mid] > arr[mid + 1])
            {
                return mid;
            }
            else if( mid > start && arr[mid] < arr[mid + 1])
            {
                return mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target, int start, int end)
    {
        while (start <=  end)
        {
            int mid = start + (end - start)/2;

            if(arr[mid] == target)
            {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
