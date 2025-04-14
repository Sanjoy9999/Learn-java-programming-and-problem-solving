import java.util.*;


public class SelectionSort{
    public static void printArray(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        
        //Selection Sort
        //Time complexity ==> O(n^2)
        for(int i=0;i<arr.length-1;i++){
            int smallest = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[smallest] > arr[j]){
                    smallest  = j;
                }
            }

            int temp = arr[smallest];//7
            arr[smallest] = arr[i]; // from 7 to 8
             arr[i] = temp;
            
        }
        printArray(arr);
    }

}