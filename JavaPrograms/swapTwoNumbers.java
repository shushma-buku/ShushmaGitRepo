import java.util.Scanner;

public class swapTwoNumbers {
    public static void main(String[] args)
    {
        swapTwoNumbersMethod();
    }
    public static void swapTwoNumbersMethod()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = s.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = s.nextInt();

        System.out.println("Number1 before Swap : "+num1);
        System.out.println("Number2 before Swap : "+num2);

        num1= num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("Number1 after Swap : "+num1);
        System.out.println("Number2 after Swap : "+num2);
    }
}