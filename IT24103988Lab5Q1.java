import java.util.Scanner;
public class  IT24103988Lab5Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your secound number : ");
        int num1 = scanner.nextInt();

        System.out.print("Enter your secound number : ");
        int num2 = scanner.nextInt();

        System.out.print("Enter your third number : ");
        int num3 = scanner.nextInt();

        int max=Math.max(num1,Math.max(num2,num3));
        System.out.println("The max number = "+ max);

        int min=Math.min(num1,Math.min(num1,num2));
        System.out.println("the min number = " +min);


    }
}