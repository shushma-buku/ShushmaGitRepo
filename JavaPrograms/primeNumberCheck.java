import java.util.Scanner;

public class primeNumberCheck
{
    static int count =0;
    static final int dividend = 2;
    public void primeCheck(int isPrime) {
        if (isPrime == 0 || isPrime == 1)
        {
            count++;
        }
        else
        {
            for (int i = dividend; i <= isPrime/dividend; i++)
            {
                if (isPrime % i == 0)
                {
                    count++;
                    break;
                }
            }
        }

    }
        public static void main(String args[])
        {
            System.out.println("Enter the number: ");

            Scanner s = new Scanner(System.in);
            int isPrime = s.nextInt();

            primeNumberCheck pMC = new primeNumberCheck();
            pMC.primeCheck(isPrime);

            if (count>0)
            {
                System.out.println(isPrime + " is not prime number");
            }
            else
                System.out.println(isPrime + " is a prime number");
        }
}


