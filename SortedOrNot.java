public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,1};

        boolean ans = isSorted(arr, 0);
        System.out.println(ans);
    }

    static boolean isSorted(int[] arr, int start)
    {
        if(start == arr.length-1)
        {
            return true;
        }

//        if(arr[start] > arr[start+1])
//        {
//            return false;
//        }
        return arr[start] > arr[start+1] && isSorted(arr, ++start);
    }

}
