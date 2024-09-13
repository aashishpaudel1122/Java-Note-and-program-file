import java.io.*;
public class FileWritingExample {
    public static void main(String[] args) {
        try(FileWriter writer=new FileWriter("test.txt")){
            writer.write("hello world");
        }
        catch(IOException e){
            e.printStackTrace();
            //System.out.println(e);
        }
    }
}
