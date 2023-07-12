public class Multilevel{
    void main(){
        System.out.println("Hello");
    }
}
class B extends Multilevel{
    void main(){
        System.out.println("Welcome");
    }
}
class C extends B{
    public static void main(String args[]){
        C obj=new C();
        obj.main();
    }
}