public class PrimeNumberSieve {
    public static void main(String[] args)
    {
        int a = 40;

        boolean[] primes = new boolean[a+1];

        primeSieve(a, primes);
    }

    public static void primeSieve(int a, boolean[] primes)
    {
        for(int i=2; i*i<=a; i++)
        {
            if(!primes[i])
            {
                for(int j=i*2; j<=a; j=j+i)
                {
                    primes[j] = true;
                }
            }
        }

        for(int i=2; i<primes.length; i++)
        {
            if(!primes[i])
            {
                System.out.print(i+"\t");
            }
        }
    }
}
