import java.util.*;

public class findCircumCircle {


    public static void circumferencesOfCircle(int r){
        float pi = 3.14f;
        float circum = 2*pi*r;
        System.out.printf("The circle circumferences value is %.2f%n",circum);
    }

    public static void main(String []args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        int r = sc.nextInt();


        circumferencesOfCircle(r);
    }
    
}
