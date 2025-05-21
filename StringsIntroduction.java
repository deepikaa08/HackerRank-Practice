import java.io.*;
import java.util.*;

public class StringsIntroduction {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        System.out.println(a.length()+b.length());
        System.out.println(a.compareTo(b)>0? "Yes":"No");
        System.out.println(a.substring(0,1).toUpperCase()+a.substring(1)+ " "
    +b.substring(0, 1).toUpperCase()+b.substring(1));
    }
}
