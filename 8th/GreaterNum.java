import java.util.*;

public class GreaterNum {

    public static void findGreatestNum(int a,int b){
        if(a>b){
            System.out.println("A is the greatest number "+a);
        }else{
            System.out.println("B is the greatest number "+b);
        }
        return;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number A : ");
        int a = sc.nextInt();
        System.out.print("Enter second number B : ");
        int b = sc.nextInt();

        findGreatestNum(a,b);
    }
}
