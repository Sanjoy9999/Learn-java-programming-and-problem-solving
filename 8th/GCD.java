import java.util.*;

public class GCD {

    public static void gcd() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = sc.nextInt();
        System.out.print("Enter second number:");
        int b = sc.nextInt();

        int gcd = 1;


        int min ;
        if(a<b){
            min = a;
        }else{
            min = b;
        }

        for (int i = 1; i <= min/2; i++) {
            if(a%i == 0 && b%i==0){
                gcd = i;
            }
            
        }
        System.out.print("The " + a + " and " + b + " Greatest Common Divisor is " + gcd);

        return;
    }

    public static void main(String[] args) {
        gcd();
    }

}
