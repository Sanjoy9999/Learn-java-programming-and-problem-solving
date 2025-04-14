import java.util.*;

public class Loops {
  public static void main(String[] args) {
    // counter++ => counter + 1;
    // for(int counter = 0;counter < 11;counter++){
    // System.out.print(counter + " ");
    // }

    // for(int i = 0; i < 11; i++){
    // System.out.println(i);
    // }

    // int i = 0;
    // while(i<11){
    // System.out.println(i);
    // i++;
    // }

    // int i = 0;
    // do{
    // System.out.println(i);
    // i++;
    // }while(i<11);

    // int i = 12;
    // while(i< 11){
    // System.out.println("Sanjoy");
    // }

    // do{
    // System.out.println("Sanjoy");
    // }while(i<11);

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

     for(int i = 1; i<11;i++)
     {
       System.out.print(n*i+ " ");
     }
  }
}