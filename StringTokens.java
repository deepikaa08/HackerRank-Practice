import java.io.*;
import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        String regex = "[^A-Za-z]+";
        
        String[] sSplit = s.trim().split(regex);
         if (sSplit.length == 1 && sSplit[0].isEmpty()) {
            System.out.println(0);
        } else{
            System.out.println(sSplit.length);
        for(String word : sSplit)
            System.out.println(word);
        }
    }
}
