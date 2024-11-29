import java.util.ArrayList;


public class ArrayListExample {
    public static void main(String[] args)
    {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        ArrayList<Integer> a = new ArrayList<>();
        for(int i=1; i<=5; i++)
        {
            a.add(i);
        }

        ArrayList<Integer> b = new ArrayList<>();
        for(int i=5; i<=8; i++)
        {
            b.add(i);
        }

        ArrayList<Integer> c = new ArrayList<>();
        for(int i=10; i<=15; i++)
        {
            c.add(i);
        }

        list.add(a);
        list.add(b);
        list.add(c);
        System.out.println(list.toString());
        System.out.println();
        for(ArrayList<Integer> out : list)
        {
            System.out.println(out.toString());
        }
    }
}
