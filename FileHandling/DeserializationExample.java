import java.io.*;
class person implements Serializable{
    public String name;
    public int age;
    person(String name, int age){
       this.name=name;
       this.age=age;
    }
}
public class DeserializationExample {
  public static void main(String[] args) {
    try{
        ObjectInputStream obj=new ObjectInputStream(new FileInputStream("person.dat"));
        person p=(person)obj.readObject();
        System.out.println("name="+p.name +"age="+p.age);
    }catch(IOException | ClassNotFoundException e){
        e.printStackTrace();
    }
  }  
}
