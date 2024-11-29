import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args)
    {
        int[] arr = {3,4,5,1,2};

        for(int i=0; i<=arr.length-2; i++)
        {
            System.out.println(Arrays.toString(arr));
            for(int j=i+1; j>0; j--)
            {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    System.out.println(Arrays.toString(arr));
                }
                else {
                    break;
                }
            }
//            System.out.println(Arrays.toString(arr));
        }
    }
}
