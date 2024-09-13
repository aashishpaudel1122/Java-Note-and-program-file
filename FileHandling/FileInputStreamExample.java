import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try(FileInputStream reader=new FileInputStream("example1.dat")){
            int bytedata;
            while((bytedata=reader.read())!=-1){
                System.out.println(bytedata);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
