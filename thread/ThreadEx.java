class MyThreads implements Runnable
{
    public void run()
    {
        for(int i=1; i<= 10; i++)
        {
            System.out.println("User Thread value:" +1);
        }
    }
}
public class ThreadEx
{
    public static void main(String[]args)
    {
        MyThread mt=new MyThread();
        Thread t =new Thread(mt);
        t.start();
    }
}