import java.io.*;
import java.util.*;

public class ValidUsername {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        scan.nextLine();
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
        for(int i=0; i<count; i++){
            if(scan.nextLine().matches(regex))
                System.out.println("Valid");
            else
                System.out.println("Invalid");
        }
    }
}
