public class SquareRoot {
    public static void main(String[] args)
    {
        int a = 40;
        sqrt1(a);
        System.out.println(Math.sqrt(40));
    }

    public static double sqrt1(int n)
    {
        int s = 0;
        int e = n;

        double root = 0.0;

        while(s <= e)
        {
            int m = s + (e-s)/2;

            if(m*m == n)
            {
                return m;
            }

            if(m*m > n)
            {
                e = m-1;
            }
            else {
                s = m+1;
                root = m;
            }
        }

        double inc = 0.1;
        for(int i=0; i<3; i++)
        {
            while(root * root <= n)
            {
                root += inc;
            }

            root -= inc;
            inc /= 10;
        }
        System.out.println(root);
        return root;
    }
}
