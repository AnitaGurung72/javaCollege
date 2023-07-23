class MyThread extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("User Thread value:"+1);
            
        }
    }
}
public class ThreadExample
{
    public static void main(String[]args)
    {
        MyThread mt=new MyThread();
        Thread t=new Thread(mt);
        t.start();
    }
}