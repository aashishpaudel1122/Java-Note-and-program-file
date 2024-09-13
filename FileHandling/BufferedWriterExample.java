import java.io.*;
public class BufferedWriterExample {
    public static void main(String[] args) {
        try(BufferedWriter writer=new BufferedWriter(new FileWriter("example.txt"))){
            writer.write("this is java");
            writer.newLine();
            writer.write("welcome to file");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
