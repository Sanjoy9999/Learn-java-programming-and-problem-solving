import java.util.*;

public class EligibleForVote {

    public static void eligibleForVote(int n){
        if(n<0){
        System.out.print("Enter valid number.");
        }
        else if(n>18){
            System.out.print("You are eligible for vote.");
        }else{
            System.out.print("You are not eligible for vote.");
        }
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age =  sc.nextInt();


        eligibleForVote(age);
        }
}
