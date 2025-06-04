import java.io.*;
import java.util.*;

public class ArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        ArrayList<Integer>[] list = new ArrayList[n];  
        for (int i = 0; i < n; i++) {
            int l1 = sc.nextInt();  
            list[i] = new ArrayList<>();  
            for (int j = 0; j < l1; j++) {
                list[i].add(sc.nextInt());  
            }
        }

        int q = sc.nextInt();  
        for (int i = 0; i < q; i++) {
            int a = sc.nextInt() - 1;  
            int b = sc.nextInt() - 1;

            if (a >= 0 && a < list.length) {
                if (b >= 0 && b < list[a].size()) {
                    System.out.println(list[a].get(b));  
                } else {
                    System.out.println("ERROR!");  
                }
            } else {
                System.out.println("ERROR!");  
            }
        }

        sc.close();
    }
}
