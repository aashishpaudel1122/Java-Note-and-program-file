import java.io.*;
public class FileReadingExample {
    public static void main(String[] args) {
        try{
         FileReader reader=new FileReader("test.txt");
         int character;
         while((character=reader.read())!=-1){
            System.out.print((char)character);
         }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
