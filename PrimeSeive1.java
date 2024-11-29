public class PrimeSeive1 {
    public static void main(String[] args) {
        int a = 50;
        boolean[] primes = new boolean[a+1];

        primeSeive(a, primes);
    }

    public static void primeSeive(int a, boolean[] arr)
    {
        for(int i=2; i*i<a; i++)
        {
            if(!arr[i])
            {
                for(int j=i*2; j<=a; j=j+i)
                {
                    arr[j] = true;
                }
            }
        }

        for(int i=2; i<arr.length; i++)
        {
            if(!arr[i])
            {
                System.out.println(i + " "+ arr[i]);
            }
        }
    }
}
