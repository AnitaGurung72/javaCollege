public class cal
{
    public static void main (String[]args)
    {
        int num1=26;
        int num2=6;
        int sum,sub,mul,quo,rem;
        System.out.println("choose your operation: +,-,*,/");
        char choice='/';
        switch(choice)
        {
            case'+':
            sum=num1+num2;
            System.out.println("The sum 0f number is: "+sum);
            break;
            case '-':
                sub=num1-num2;
                System.out.println("The differencr of number is:" +sub);
                break;
                case '*':
                    mul=num1*num2;
                    System.out.println("The multiple of number is:" +mul);
                    break;
                    case '/':
                        quo=num1/num2;
                        rem=num1%num2;
                        System.out.println("The quotient of number is: "+quo); 
                        System.out.println("The remainter of number is: "+rem);
                        break;
                        default:
                            System.out.println("Invalid operation");
                        
                        
            
                        
                        
                        
                        
                        
                        
                        
                        
                        
            
            
        }
        
    }
}