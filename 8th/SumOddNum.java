// import java.util.*;


public class SumOddNum {
 
    public static void printSumOddNum(long n){
        long sum = 0;
       for(int i=1;i<=n;i++){
        if(i % 2 != 0){
            sum = sum + i;
        }
       }
       System.out.println("Sum of odd number from 1 to "+n+" is "+sum);
       return;
    }


    
    public static void main(String [] args){
          long n = 1007457640;
          printSumOddNum(n);
    }
}
