import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
public class SyntaxChecker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        scan.nextLine();
        for(int i=0; i<count; i++){
            try{
                Pattern.compile(scan.nextLine());
            }catch(Exception e){
                System.out.println("Invalid");
                continue;
            }
            System.out.println("Valid");
        }
    }
}
