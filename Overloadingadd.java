public class Overloadingadd{
    public int sum(int x, int y)
    {
        return(x+y);
    }
    public int sum(int x, int y, int z)
    {
        return (x+y+z);
    }
    public double sum( double x, double y)
    {
        return (x+y);
    }
    public static void main (String []args)
    {
        Overloadingadd s= new Overloadingadd();
        System.out.println(s.sum (10, 30));
        System.out.println(s.sum(10, 20, 30));
        System.out.println(s.sum(10.3, 12.5));
        
        
        
    }
}