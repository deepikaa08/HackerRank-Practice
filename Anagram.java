import java.io.*;
import java.util.*;

public class Anagram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = scan.nextLine().toLowerCase().chars().sorted().toArray();
        int[] b = scan.nextLine().toLowerCase().chars().sorted().toArray();
        if(Arrays.equals(a, b))
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
       
    }
}
