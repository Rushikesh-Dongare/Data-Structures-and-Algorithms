import java.util.Arrays;

public class LinearSearch2DArrays {
    public static void main(String[] args)
    {
        int[][] arr = {
                {10,8,2},
                {30,15,7},
                {22,12,9},
                {98,78,45}
        };
        System.out.println("Array Elements are: ");
        displayArray(arr);
        System.out.println();
        System.out.println(Arrays.toString( findIn2DArray(arr, 12)));;
        System.out.println();
        System.out.println(Arrays.toString(additionEachArray(arr)));
        System.out.println();
        System.out.println("Maximum element from this array : "+findMax(arr));
        System.out.println();
        System.out.println("Smallest element from this array : "+findMin(arr));
    }

    static void displayArray(int[][] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int a : arr[i])
            {
                System.out.print(a+"\t");
            }
            System.out.println();
        }
    }

    static int[] findIn2DArray(int[][] arr, int ele)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                if(arr[i][j] == ele)
                {
                    return new int[] {i, j};
                }
            }
        }

        return new int[] {-1, -1};
    }

    static int[] additionEachArray(int[][] arr)
    {
        int[] addition = new int[arr.length];
        for(int i=0; i<arr.length; i++)
        {
            int add = 0;
            for(int j : arr[i])
            {
                add += j;
            }
            addition[i] = add;
        }
        return addition;
    }

    static int findMax(int[][] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            for(int a : arr[i])
            {
                if(max < a)
                {
                    max = a;
                }
            }
        }

        return max;
    }
    static int findMin(int[][] arr)
    {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            for(int a : arr[i])
            {
                if(min > a)
                {
                    min = a;
                }
            }
        }

        return min;
    }
}
