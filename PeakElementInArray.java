public class PeakElementInArray {
    public static void main(String[] args)
    {
        int[] arr = {2,1,3,5,6,4};
        int target = 2;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

   public static int findPeakIndex(int[] arr)
   {
       int start = 0, end = arr.length-1, mid = 0;
       while(start < end)
       {
           mid = start + (end - start)/2;

           if(arr[mid] >= arr[mid + 1])
           {
               end = mid;
           }
           else {
               start = mid + 1;
           }
       }
       return start;
   }

   public static int binarySearch(int[] arr, int target)
   {
       int start = 0, end = findPeakIndex(arr), mid = 0;
       while(start <= end)
       {
           mid = start + (end - start)/2;
           if(arr[mid] == target)
           {
               return mid;
           } else if (target < arr[mid]) {
               end = mid - 1;
           }else{
               start = mid + 1;
           }
       }
       start = findPeakIndex(arr);
       end = arr.length-1;

       while(start <= end)
       {
           mid = start + (end - start)/2;
           if(arr[mid] == target)
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
       return -1;
   }

}
