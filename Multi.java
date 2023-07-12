public class Multi
{
    public static void main(String[]args)
    {
        int i, j, mul;
        System.out.println("The multiplication table of 5 is:");
        for(i=1;i<10;i++)
        {
            for(j=1;j<=10;j++)
            {
                mul=i*j;
                System.out.println(i+"*"+j+"="+mul);
            }
        }
    }
}