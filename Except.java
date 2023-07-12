public class Except
{
    public static void main(String[]args)
    {
        int i, sum=0;
        for(i=1;i<=100;i++)
        {
            if(i==41)
            continue;
            sum+=i;
        }
        System.out.println("The sum except 41 is "+sum);
    }
}