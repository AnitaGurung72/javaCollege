interface X{
    void print();
}
interface A{
    void show();
}
class B implements X,A{
    public void print(){
        System.out.println("Hello");
    }
    public void show(){
        System.out.println("Welcome");
    }
    public static void main(String args[]){
        B obj=new B();
        obj.print();
        obj.show();
    }
}