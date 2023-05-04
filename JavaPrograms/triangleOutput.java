import java.util.Scanner;

public class triangleOutput
{
        public void printTriangle(int number, int size)
        {
            for (int i = 0; i <= size; i++)
            {
                for (int j=0;j<i;j++)
                {
                    System.out.print(number);
                }
                System.out.println(" ");
            }
        }
     public static void main(String args[])
    {
        triangleOutput tO = new triangleOutput();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to be displayed as triangle : ");
        int num = s.nextInt();
        System.out.println("Enter the size of the triangle : ");
        int siz = s.nextInt();
        tO.printTriangle(num,siz);
    }
}


