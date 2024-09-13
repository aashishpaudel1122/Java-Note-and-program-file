import java.io.*;
public class FileOutputStreamExample {
    public static void main(String[] args) {
        try(FileOutputStream writer=new FileOutputStream("Example1.dat")){
            writer.write(new byte[]{34,56,78});

        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
