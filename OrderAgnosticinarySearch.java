public class OrderAgnosticinarySearch {
    public static void main(String[] args)
    {
        int[] arr = {10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40};
        int[] arr2 = {50,48,46,44,42,40,38,36,34,32,30,28,26,24,22,20,18};
        System.out.println(arr2.length);

        int target = 12;
        int ans = binarySearch(arr, target);
        System.out.println("Element found at : "+ans);
    }

    public static int binarySearch(int[] arr, int target)
    {
        int start = 0, end = arr.length-1;
        boolean isAscending = arr[start] < arr[end];
        while(start <= end)
        {
            int mid = start + (end-start)/2;
            if(isAscending)
            {
                if(target == arr[mid])
                {
                    return mid;
                }
                else if(target < arr[mid])
                {
                    end = mid - 1;
                }
                else {
                    start = mid - 1;
                }
            }
            else {
                if(target == arr[mid])
                {
                    return mid;
                }
                else if(target < arr[mid])
                {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
