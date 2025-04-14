import java.util.*;

public class EnterRandomNum {

    public static void randomNumber() {
        Scanner sc = new Scanner(System.in);

        int negativeCount = 0;
        int positiveCount = 0;
        int zerosCount = 0;
        char choice;

        do {

            System.out.print("Enter any number:");
            int num = sc.nextInt();
            if (num == 0) {
                zerosCount++;
            } else if (num > 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }
            
            System.out.print("Do you want to enter another number (y/n)? ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("You have entered " + positiveCount + " positive number");
        System.out.println("You have entered " + negativeCount + " negative number");
        System.out.println("You have entered " + zerosCount + " zeroes number");

        return;

    }



    public static void main(String[] args) {

        randomNumber();

    }
}
