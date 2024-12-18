import java.util.Arrays;

public class Pattern {
    public static void main(String[] args) {
        printPattern1(4, 0);
        System.out.println();
        printPattern2(4, 0);
    }

    static void printPattern1(int r, int c)
    {
        if(r == 0)
            {
                return;
        }
        if(c < r)
        {
            System.out.print(" * ");
            printPattern1(r, ++c);
        }
        else {
            System.out.println();
            printPattern1(--r, 0);
        }
    }
    static void printPattern2(int r, int c)
    {
        if(r == 0)
        {
            return;
        }
        if(c < r)
        {
            printPattern2(r, ++c);
            System.out.print(" * ");
        }
        else {
            printPattern2(--r, 0);
            System.out.println();
        }
    }
}
