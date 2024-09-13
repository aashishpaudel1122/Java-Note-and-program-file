import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(3);
        arr.add(20);
        arr.add(30);
        arr.add(10);
        System.out.println("size="+arr.size());
        arr.remove(1);
        System.out.println("size="+arr.size());
        arr.set(0,100);
        Collections.sort(arr);
        for(int i=0;i<arr.size();i++)
          System.out.println(arr.get(i));
        System.out.println("size="+arr.size());
        
    }
}
