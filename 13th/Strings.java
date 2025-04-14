import java.util.*;

public class Strings {
    public static void main(String arg[]) {
        StringBuilder sb = new StringBuilder("hello");
        

        // // char at index 0
        // System.out.println(sb.charAt(0));

        // // set char at index 0
        // sb.setCharAt(0, 'p');
        // System.out.println(sb);


        // //insert function
        // sb.insert(2,'n');
        // System.out.println(sb);

        // //delete the extra "n"
        // sb.delete(2,4);
        // System.out.println(sb);


        // sb.append("e"); //str = str + "e"
        // sb.append("l"); //str = str + "l"
        // sb.append("l");
        // sb.append("o");
        // System.out.println(sb.length());


        for(int i=0;i<sb.length()/2;i++){ //O(n)
            int front = i;
            int back =sb.length()-1-i;//5-1-0 = 4

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }

        System.out.println(sb);
    }
}
