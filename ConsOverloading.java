public class ConsOverloading
{
    public String name;
    public int rollNo;
    public int year;
    public ConsOverloading()
    {
        name= null;
        rollNo= 0;
        year= 0;
    }
    public ConsOverloading(String n, int r)
    {
        name =n;
        rollNo=r;
    }
    public ConsOverloading(String n, int r, int y)
    {
        name= n;
        rollNo=r;
        year=y;
    }
    public void display()
    {
        System.out.println("RollNo: "+rollNo+"Name:"+name+"Year:"+year);
    }
    public static void main(String[]args)
    {
        ConsOverloading s1= new ConsOverloading("Ismriti", 06,20 );
        ConsOverloading s2= new ConsOverloading("samiksha", 07, 19);
        s1.display();
        s2.display();
        
        
    }
}