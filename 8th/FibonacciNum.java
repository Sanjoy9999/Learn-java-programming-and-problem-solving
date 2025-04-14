import java.util.*;

public class FibonacciNum {

    // 0 1 1 2 3 5 8 13 21 34 .....
    public static void fibonacciNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fibonacci number position:");
        int n = sc.nextInt();

        int firstNum = 0;
        int secondNum = 1;
        int sum = 0;

        if (n == 0) {
            System.out.println(firstNum);
        } else if (n == 1) {
            System.out.print(secondNum);
        } else {
            for (int i = 2; i <= n; i++) {

                sum = firstNum + secondNum;
                firstNum = secondNum;
                secondNum = sum;
            }
            System.out.print(secondNum);
        }

        return;
    }

    public static void main(String args[]) {
        fibonacciNum();
    }
}