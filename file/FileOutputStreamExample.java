import java.io.*;
public class FileOutputStreamExample {
  public static void main(String[] args) {
    try{
      FileOutputStream out1=new FileOutputStream("student.dat");
      out1.write(new byte[]{1,2,3,4});
    }
    catch(IOException e){
        e.printStackTrace();
    }
  }  
}
