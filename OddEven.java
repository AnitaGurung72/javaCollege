public class OddEven{
    public static void main(String[]args){
        int i;
        for(i=1;i<=100;i++)
        {
            if(i%2==0)
            {
                System.out.println("The even number are "+i);
            }
            else
            System.out.println("The odd number are"+i);
        }
        while(i<=100)
        {
            if(i%2==0)
            {
                System.out.println("The even number are "+i);
            }
            else
            System.out.println("The odd number are "+i);
        }
        do
        {
            if(i%2==0)
            {
                System.out.println("The even number are "+i);
            }
            else
            System.out.println("The odd number are "+i);
        }
        while(i<=100);
    }
}