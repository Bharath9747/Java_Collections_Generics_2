import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
public class Main5 {
    public static void main(String[] args){
        try(FileOutputStream fileOutputStream =new FileOutputStream("C:\\Users\\bharath.m\\IdeaProjects\\Java_Collections_1\\src\\mine.txt");
                InputStream input = new FileInputStream("C:\\Users\\bharath.m\\IdeaProjects\\Java_Collections_1\\src\\mine.txt")){
            String msg = "Hello World";
            byte[] byteArray = msg.getBytes();
            fileOutputStream.write(byteArray);
            DataInputStream inst = new DataInputStream(input);
            int data = input.available();
            byte[] byteArray2 = new byte[data];
            inst.read(byteArray2);
            String str = new String(byteArray2);
            System.out.println(str);

        }catch(Exception exception){
            exception.printStackTrace();
        }
    }
} 