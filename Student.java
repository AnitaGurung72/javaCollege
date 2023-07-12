public class Student
{
    public String name;
    public int rollNo;
    public void display()
    {
        System.out.println(rollNo+""+name);
    }
    public static void main (String []args)
    {
       Student s1= new Student();
       Student s2=new Student();
       s1.display();
       s2.display();
       
       
    }
}