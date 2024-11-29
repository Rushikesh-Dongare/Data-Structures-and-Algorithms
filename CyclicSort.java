import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args)
    {
        int[] arr = {0,1};

        int ans = missingElement(arr);
        System.out.println(ans);
    }

    public static int missingElement(int[] arr)
    {
        int i=0;
        while(i < arr.length)
        {
            int correctIndex = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correctIndex])
            {
                swap1(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }

        for(int j=0; j<arr.length; j++)
        {
            if(arr[j] != j)
            {
                return j;
            }
        }
        return arr.length;
    }
    static void swap1(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
