import java.io.*;
import java.util.*;
class Elements{
    public static <E> void printArray(E[] array){
        for(E item : array){
            System.out.println(item);
        }
    }
}
public class Generics{

    public static void main(String[] args) {
        Elements e = new Elements();
        Integer[] nums = {1, 2, 3};
        String[] words = {"Hello", "World"};
        e.printArray(nums);
        e.printArray(words);
    }
}
