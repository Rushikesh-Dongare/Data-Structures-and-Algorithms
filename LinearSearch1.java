import java.util.Arrays;

public class LinearSearch1 {
    public static void main (String[] args)
    {
        int[] arr = {59, 86, 10, 38, 54, 40, 7, 83, 949, 304};
        System.out.println("Length of an array : "+arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.println("Element found in : "+findElement(arr, 34));
        System.out.println();
        System.out.println("Element find in range : "+findInRange(arr, 12, 2, 5));
        System.out.println();
        System.out.println("Maximum element from this array : "+findMax(arr));
        System.out.println();
        System.out.println("Minimum element from this array : "+findMin(arr));
        System.out.println();
        System.out.println(arr.length);
        System.out.println("Total Even numbers in this arrar are : "+findEvenDigits(arr));
    }

    static int findElement(int[] arr, int ele)
    {
        if(arr.length == 0)
        {
            return -1;
        }

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == ele)
            {
                return i;
            }
        }
        return -1;
    }

    static int findInRange(int[] arr, int ele, int start, int end)
    {
        for(int i=start; i<=end; i++)
        {
            if(arr[i] == ele)
            {
                return i;
            }
        }
        return -1;
    }

    static int findMax(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        return max;
    }

    static int findMin(int[] arr)
    {
        int min = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }

    static int findEvenDigits(int[] arr)
    {
        int totalEven = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(findNoOfDigits(arr[i])%2 == 0)
            {
                totalEven++;
            }
        }
        return totalEven;
    }

    static int findNoOfDigits(int ele)
    {
        int noOfDIgits = 0;
        while(ele>0)
        {
            noOfDIgits++;
            ele /= 10;
        }
        return noOfDIgits;
    }

}
