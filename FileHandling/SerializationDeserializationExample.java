import java.io.*;
class Person{
    private String name;
    private int age;
    Person(String n, int a){
        this.name=n;
        this.age=a;
    }
}
public class SerializationDeserializationExample {
    public static serializePerson(Person person,String filename){
        try{
            ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream(filename));
            obj.writeObject(person);
            System.out.println("serilization successful"+person);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static Person deSerialize(String filename){
        try{
            ObjectInputStream ob=new ObjectInputStream(new FileInputStream(filename));
        Person person=(Person)ob.readObject();
        return person;    
        }
        catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[] args) {
        Person person=new Person("ram",45);
        String filename="person.dat";
        serializePerson(person,filename);
        Person deserilize=deSerialize(filename);
        System.out.println(deserilize);

    }
}
