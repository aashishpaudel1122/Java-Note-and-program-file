import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class person implements Serializable{
    private String name;
    private int age;
    person(String name, int age){
       this.name=name;
       this.age=age;
    }
}
public class SerialzableExample {
    public static void main(String[] args) {
        person p=new person("john",24);
        try{
            ObjectOutputStream object=new ObjectOutputStream(new FileOutputStream("person.dat"));
            object.writeObject(p);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    

}
