import java.io.*;
import java.util.*;

public class Map {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, String> phone = new HashMap<>();
        int n = scan.nextInt();
        scan.nextLine();
        
        for(int i=0; i<n; i++){
            String name = scan.nextLine();
            String num = scan.nextLine();
            phone.put(name, num);
        }
        
        while(scan.hasNextLine()){
            String qr = scan.nextLine();
            if(phone.containsKey(qr)){
                System.out.println(qr+"="+phone.get(qr));
            }
            else{
                System.out.println("Not found");
            }
        }
    }
}
