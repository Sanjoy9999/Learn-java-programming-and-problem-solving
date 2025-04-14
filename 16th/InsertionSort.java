
import java.util.*;

public class InsertionSort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = { 7, 8, 3, 1, 2 };

        // Selection sort
        //Time complexity O(n^2)
        for (int b = 0; b < arr.length; b++) {
            int current = arr[b];
            int a = b - 1;
            while (a >= 0 && current < arr[a]) {
                arr[a + 1] = arr[a];
                a--;
            }

            //placement
            arr[a+1] = current;

        }

        printArray(arr);
    }
}
