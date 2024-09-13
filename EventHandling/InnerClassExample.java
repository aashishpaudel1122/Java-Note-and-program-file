class OuterClass{
    int x=5;
    class InnerClass{
        int y=10;
    }
}
public class InnerClassExample {
   public static void main(String args[]){
    OuterClass myOuter=new OuterClass();
    OuterClass.InnerClass myInner= myOuter.new InnerClass();
    System.out.println("sum="+(myOuter.x+myInner.y));
   } 
}
