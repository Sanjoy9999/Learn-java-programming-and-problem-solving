import java.util.*;


public class Bits{
    public static void main(String []args){
        Scanner sc = new  Scanner(System.in);
        int  opr = sc.nextInt();
        //if operation  = 1 ? set operation : clear operation
        int n = 5;//0101 -->0111
        int pos = 1;
       
        int bitMask = 1<<pos;
        
        if(opr == 1){

            //set operation 
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }else{

            //clear
            int notBitMask = ~(bitMask);
            int newNumber = notBitMask & n;
            System.out.println(newNumber);
        }



    
    }
}