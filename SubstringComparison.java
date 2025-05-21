import java.io.*;
import java.util.*;

public class SubstringComparison {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int k = scan.nextInt();
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        for(int i=0;i<=s.length()-k;i++)
        {
            String temp = s.substring(i,i+k);
            if(temp.compareTo(smallest)<0)
                smallest = temp;
            if(temp.compareTo(largest)>0)
                largest = temp;
        }
        System.out.println(smallest);
        System.out.print(largest);
    }
}
