import java.io.*;
import java.util.*;

public class IntToString {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        String s = Integer.toString(n);
        if(s!=null && s.equals(String.valueOf(n)))
            System.out.println("Good job");
        else
            System.out.println("Wrong answer");
    }
}
