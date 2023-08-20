import java.io.*;
public class SerializationDemo {
    public static void main(String args[]) throws IOException{
        Student s = new Student(7,"saman","Itahari");
        FileOutputStream fos = new FileOutputStream("file.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s);
        System.out.println("Object is written");
        oos.close();
        fos.close();
    }
}
