import java.util.Scanner;
public class generatePrimeNumbers
{
    static int count = 0;
    static final int dividend = 2;

    public void generatePrime(int limit)
    {
             for(int j=2;j<=limit;j++)
             {
                for (int i = dividend; i <= j / dividend; i++)
                {
                     if (j % i == 0)
                     {
                         count++;
                         break;
                     }
                }
                 if(count == 0)
                {
                    System.out.println(j);
                }
                else
                    count = 0;
           }
    }


    public static void main(String args[])
    {
        System.out.println("Enter the limit: ");

        Scanner s = new Scanner(System.in);
        int limit = s.nextInt();

        generatePrimeNumbers pMC = new generatePrimeNumbers();
        if(limit>1)
        {
            System.out.println("Prime Numbers upto the "+limit+": ");
            System.out.println("0");
            System.out.println("1");
            pMC.generatePrime(limit);
        }
        else
        {
            System.out.println("No Prime Numbers upto the limit :"+limit);
        }
    }
}
