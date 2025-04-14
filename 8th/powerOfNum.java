import java.util.*;

public class powerOfNum {

    public static void powerNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a number:");
        int x = sc.nextInt();
        System.out.print("Enter number a number for power value:");
        int n = sc.nextInt();
          
        int result = 1;
        for(int i=1;i<=n;i++){
            result *=x;
        }

        System.out.println("The power value is "+result);
        return;

    }

    public static void main(String []args){
        powerNumber();
    }
    
}
