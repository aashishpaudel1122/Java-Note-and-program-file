import java.io.*;
public class FileExample {
    public static void main(String[] args) {
        try{
            FileReader file=new FileReader("example.txt");
            int character;
            while((character=file.read())!=-1){
                System.out.print((char)character);
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
