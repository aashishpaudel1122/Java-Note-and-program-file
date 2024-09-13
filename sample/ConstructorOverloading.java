//constructor overloading
class Box{
    double length;
    double width;
    double height;
    Box(){
        height=-1;
        width=-1;
        length=-1;
    }
    Box(double l, double h,double w){
        length=l;
        width=w;
        height=h;
    }
    Box(double len){
        length=width=height=len;
    }
    double volume(){
      return length*width*height;
    }
}
public class ConstructorOverloading{
    public static void main(String[] args) {
        Box b1=new Box();
        Box b2=new Box(23.7);
        Box b3=new Box(23.5,45.5,12.5);
        System.out.println(b1.volume());
        System.out.println(b2.volume());
        System.out.println(b3.volume());
    }
}