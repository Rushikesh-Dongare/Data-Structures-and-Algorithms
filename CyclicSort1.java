import java.util.Arrays;

public class CyclicSort1 {
    public static void main(String[] args)
    {
        int[] arr = {5,4,5,3,1};
        boolean containsZero = false;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == 0)
            {
                containsZero = true;
            }
        }

        if(containsZero)
        {
            cycleSort2(arr);
        }
        else {
            cycleSort1(arr);
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(findMissing(arr));
    }

    public static int findMissing(int[] arr) {
        for(int j=0; j<arr.length; j++)
        {
            if(arr[j] != j)
            {
                return j;
            }
        }
        return arr.length;
    }

    public static void cycleSort1(int[] arr)
    {
        int i=0;
        while(i < arr.length)
        {
            int correctIndex = arr[i]-1;

            if(arr[i] != arr[correctIndex])
            {
                swap(arr, i, correctIndex);
            }
            else {
                i++;
            }
        }
    }

    public static void cycleSort2(int[] arr)
    {
        int i=0;
        while(i < arr.length)
        {
            if(arr[i] < arr.length && arr[i] != i)
            {
                swap(arr, arr[i], i);
            }
            else {
                i++;
            }
        }
    }

    public static void swap(int[] arr, int one, int two)
    {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}
