import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class IOStreamsExample {
    public static void main(String []args)throws IOException{
        File file = new File("file.txt");
        FileReader reader = new FileReader(file);
        char chars[] = new char[(int) file.length()];
        reader.read (chars);
        File out = new File("D:/Copyofmyfile.txt");
        FileWriter  writer = new FileWriter(out);
        writer.write(chars);
        writer.flush();
        System.out.println("Data successfully written in the specified file");

    }
}
