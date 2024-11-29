import java.util.Arrays;

public class BinarySearch2D {
    public static void main(String[] args)
    {
        int[][] arr = {{10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}};
        int target = 52;

        int[] ans = search2d(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] search2d(int[][] arr, int target)
    {
        int start = 0, end = arr.length-1;
        int[] ans = {-1,-1};
        while(end > 0 && start <arr.length)
        {
            if(arr[start][end] == target)
            {
                ans[0] = start;
                ans[1] = end;
                return ans;
            } else if (target < arr[start][end]) {
                end--;
            }
            else{
                start++;
            }
        }
        return ans;
    }
}
