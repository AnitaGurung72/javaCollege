import java.io.*;
public class DeSerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream("file.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student s= (Student)ois.readObject();
        s.display();
        ois.close();
    }
}
