import java.util.ArrayList;

public class RecurssionLinearSearch {
    public static void main(String[] args) {
        int[] arr = {4,9,5,2,7,1,4,2,5,2,6,2,7,8,9,2};
        int target = 2;
        boolean ans = search(arr, target, 0);
        int ans1 = search1(arr, target, 0);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(ans);
        System.out.println("Found at : "+ans1);
        System.out.println("Searching from last index : "+searchFromLast(arr, target, arr.length-1));
        System.out.println("Searching from last index : "+searchFromLast1(arr, target, arr.length-1));
        System.out.println("Searching for all occurances : "+search2(arr, list, target, 0));
        System.out.println("Searching for all occurances : "+search3(arr, target, 0));
    }

    static boolean search(int[] arr, int target, int start)
    {
        if(start == arr.length)
        {
            return false;
        }
        return arr[start] == target || search(arr, target, ++start);
    }

    static boolean searchFromLast(int[] arr, int target, int end)
    {
        if(end == 0)
        {
            return false;
        }
        return arr[end] == target || searchFromLast(arr, target, --end);
    }


    static int searchFromLast1(int[] arr, int target, int end)
    {
        if(end == 0)
        {
            return -1;
        }
        if(arr[end] == target)
        {
            return end;
        }
        return searchFromLast1(arr, target, --end);
    }


    static int search1(int[] arr, int target, int start)
    {
        if(start == arr.length)
        {
            return -1;
        }
        if(arr[start] == target)
        {
            return start;
        }
        return search1(arr, target, ++start);
    }

    static ArrayList search2(int[] arr, ArrayList list, int target, int start)
    {
        if(start == arr.length)
        {
            return list;
        }
        if(arr[start] == target)
        {
            list.add(start);
        }
        return search2(arr, list, target, ++start);
    }

    static ArrayList search3(int[] arr, int target, int start)
    {
        ArrayList list = new ArrayList();
        if(start == arr.length)
        {
            return list;
        }
        if(arr[start] == target)
        {
            list.add(start);
        }
        list.addAll(search3(arr, target, ++start));
        System.out.println(list);
        return list;
    }
}
