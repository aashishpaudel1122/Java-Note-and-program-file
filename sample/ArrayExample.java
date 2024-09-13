import java.util.*;
public class ArrayExample {
    void display(int a[]){
       
        for(int i:a)
         System.out.println(i);
        
    }
    static void get(int a[]){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++)
           a[i]=sc.nextInt();
    }
    public static void main(String args[]) {
        ArrayExample arr=new ArrayExample();
        int a[]={1,2,3,4,5};
        int b[]=new int[5];
        get(b);
        arr.display(b);

    }
}
