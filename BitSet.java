import java.util.*;

public class BitSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        int m = scanner.nextInt(); 
        BitSet[] bitsets = new BitSet[3]; 
        bitsets[1] = new BitSet(n);
        bitsets[2] = new BitSet(n);

        for (int i = 0; i < m; i++) {
            String operation = scanner.next();
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            switch (operation) {
                case "AND":
                    bitsets[x].and(bitsets[y]);
                    break;
                case "OR":
                    bitsets[x].or(bitsets[y]);
                    break;
                case "XOR":
                    bitsets[x].xor(bitsets[y]);
                    break;
                case "FLIP":
                    bitsets[x].flip(y);
                    break;
                case "SET":
                    bitsets[x].set(y);
                    break;
            }
            System.out.println(bitsets[1].cardinality() + " " + bitsets[2].cardinality());
        }
        scanner.close();
    }
}
