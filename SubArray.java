import java.io.*;
import java.util.*;

public class Subarray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++)
            arr[i] = scan.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
        int sum = 0;

        for (int j = i; j < n; j++) {
            sum += arr[j];

            if(sum < 0){
                count++;
            }
        }
    }
    System.out.println(count);


    }
    
}
