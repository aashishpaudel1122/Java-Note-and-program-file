public class MyOuterClass {
    int x=23;
    class myInnerClass{
        int y=10;
    }
    public static void main(String[] args) {
        MyOuterClass outer=new MyOuterClass();
        MyOuterClass.myInnerClass inner=outer.new myInnerClass();
        System.out.println(outer.x+inner.y);
    }
}
