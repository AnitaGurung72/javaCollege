public class Calculator{
    int i=10;
    int k=10;
    Calculator (int i, int j, int k){
        int result =100;
        System.out.println(" The result is : "+result);
    }
    public static void main (String []args){
        Calculator cl= new Calculator (10, 10, 10);
        System.out.println(cl.i);
    }
}