import java.util.*;
public class Test2 {
    int sum(int x, int y){
        return x+y;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Test2 t=new Test2();
       
        System.out.println( t.sum(a, b));
    }
}
