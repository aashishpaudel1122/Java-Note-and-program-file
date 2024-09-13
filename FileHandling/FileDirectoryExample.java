import java.io.*;
public class FileDirectoryExample {
    public static void main(String[] args) {
        File directory=new File("ram");
        if(directory.mkdir()){
            System.out.println("directory created successfully");
        }
        else{
            System.out.println("not created or already exists");
        }
        String[] files=directory.list();
        if(files!=null){
            for(String x:files){
                System.out.println(x);
            }
        }
    }
}
