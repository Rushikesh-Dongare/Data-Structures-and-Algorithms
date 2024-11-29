import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr)
    {
        int s = 0, e = arr.length-1;
        while(s<e)
        {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
