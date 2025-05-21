import java.io.*;
import java.util.*;

public class Reverse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine();
        StringBuilder s = new StringBuilder(A);
        if(A.compareTo(s.reverse().toString())==0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
