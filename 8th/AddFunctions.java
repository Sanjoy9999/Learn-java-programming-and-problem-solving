import java.util.*;

public class AddFunctions {

    public static void averageNumber(int a, int b, int c) {
        float average = (a + b + c) / 3.0f;
        System.out.printf("Average of three numbers is %.2f", average);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        averageNumber(a, b, c);
    }
}
