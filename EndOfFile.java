import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EndOfFile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int linecount = 1;
        while(scan.hasNext()){
            String s =scan.nextLine();
            System.out.println(linecount+" "+s);
            linecount++; 
        }
        scan.close();
    }
}
