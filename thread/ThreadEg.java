class ThreadEg extends Thread{
    public void run()
    
    {
      System.out.println("inside run method");  
    }
    public static void main (String[]args)
    {
    ThreadEg t1=new ThreadEg();
    ThreadEg t2=new ThreadEg();
    ThreadEg t3=new ThreadEg();
    System.out.println("t1 thread priority:"+t1.getPriority());
    System.out.println("t2 thread priority:" +t2.getPriority());
    System.out.println("t3 thread priority:" +t3.getPriority());
    t1.setPriority(2);
    t2.setPriority(8);
    t3.setPriority(10);
    System.out.println("t1 thread priority:"+t1.getPriority());
    System.out.println("t2 thread priority:" +t2.getPriority());
    System.out.println("t3 thread priority:" +t3.getPriority());
    System.out.println("Currently executing thread:"+Thread.currentThread().getName());
    System.out.println("Main thread Priority:"+Thread.currentThread().getPriority());
    Thread.currentThread().setPriority(10);
    System.out.println("Main thread priority:"+Thread.currentThread().getPriority());
    }
    
}
