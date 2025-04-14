import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = sc.nextInt();
        System.out.print("Enter second number:");
        int b = sc.nextInt();
        System.out.println("Enter any sign +,-,*,/,%");
        char sign = sc.next().charAt(0);

        switch (sign) {
            case '+':
                System.out.println("Result:" + (a + b));
                break;
            case '-':
                System.out.println("Result:" + (a - b));
                break;
            case '*':
                System.out.println("Result:" + (a * b));
                break;
            case '/':
                if (b != 0) {

                    System.out.println("Result:" + (a / b));
                } else {
                    System.out.println("0 can't divisible any number.");
                }
                break;
            case '%':
                if (b != 0) {

                    System.out.println("Result:" + (a % b));
                } else {
                    System.out.println("0 can't divisible any number.");
                }
                break;
            default:
                System.out.println("Input valid sign.");
        }
    }
}
