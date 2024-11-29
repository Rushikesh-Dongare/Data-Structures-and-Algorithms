import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        int[][] arr = {
                {1,2,3},
                {4,5},
                {7,8,9, 10}
        };

        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        Scanner in = new Scanner(System.in);
        int[][] arr1 = new int[3][2];
        System.out.println("Enter your values: ");
        for(int i=0; i<arr1.length; i++)
        {
            for(int j=0; j<2; j++)
            {
                arr1[i][j] = in.nextInt();
            }
        }

        for(int i=0; i<arr1.length; i++)
        {
            for(int j=0; j<arr1[i].length; j++)
            {
                System.out.print(arr1[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
