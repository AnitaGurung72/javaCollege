public class ExceptionHandling{
    public static void main(String[]args){
        divisibleNumbers(9, 3);
        divisibleNumbers(9, 0);
        divisibleNumbers(9, 3);
    }
    public static void divisibleNumbers(int a, int b){
        try{
            int result= a/b;
            System.out.println("The result is:"+result);
        }catch(ArithmeticException e) {
            System.out.println("Error:divided by 0 is not allowed.");
        }catch(NumberFormatException e){
            System.out.println("Error :Invalid operation types.");
        }catch(Exception e){
            System.out.println("An error occurred:"+e.getMessage());
        }
    }
}