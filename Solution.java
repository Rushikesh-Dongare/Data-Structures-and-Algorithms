import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution
{
    public static void main(String[] args) {
        int[] arr = {7,8,9,11,12};
        System.out.println(Arrays.toString(arr));
        System.out.println(cycleSort1(arr));
    }

    static int cycleSort1(int[] arr)
    {
        int j=0;
        while(j < arr.length)
        {
            int correctIndex = arr[j]-1;

            if(arr[j]>0 && arr[j] <= arr.length && arr[j] != arr[correctIndex])
            {
                swap(arr, j, correctIndex);
            }
            else {
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i+1;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr, int one, int two)
    {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}