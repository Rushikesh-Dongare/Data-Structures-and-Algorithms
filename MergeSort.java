import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {10,20,4,3,8,1,2,7,30};
        int[] ans = margeSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] margeSort(int[] arr)
    {
        if(arr.length == 1)
        {
            return arr;
        }

        int mid = arr.length/2;
        int[] fh = margeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] sh = margeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return marge(fh, sh);
    }

    static int[] marge(int[] first, int[] sec)
    {
        int[] ans = new int[first.length + sec.length];
        int i=0,j=0,k = 0;

        while(i<first.length && j<sec.length)
        {
            if(first[i] < sec[j])
            {
                ans[k] = first[i];
                i++;
            }
            else {
                ans[k] = sec[j];
                j++;
            }
            k++;
        }

        while(i < first.length)
        {
            ans[k] = first[i];
            i++;
            k++;
        }

        while(j < sec.length)
        {
            ans[k] = sec[j];
            j++;
            k++;
        }
        return ans;
    }
}
