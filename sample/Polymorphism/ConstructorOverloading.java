class Box{
    double length;
    double height;
    double width;
    Box(){
        length=-1;
        height=-1;
        width=-1;
    }
    Box(double len){
        length=width=height=len;
    }
    Box(double l, double w, double h){
        length=l;
        width=w;
        height=h;
    }
    double volume(){
        return length*height*width;
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Box b1=new Box();
        Box b2=new Box(34.8);
        Box b3=new Box(12.3,34.5,11.3);
        System.out.println("volume box1="+b1.volume());
        System.out.println("volume of Box2"+b2.volume());
        System.out.println("volume of box3="+b3.volume());

    }
}
