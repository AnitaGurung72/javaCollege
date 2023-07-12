public class Dec
{
    public static void main(String[]args)
    {
        double num =12.23455;
        int n=2;
        num=Math.round(num*Math.pow(10,n))/Math.pow(10,n);
        System.out.println("The round num is : " +num);
    }
    
}