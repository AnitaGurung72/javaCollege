public class Encapsulation{
    private int a;
    private String name;
    public int getA(){
        return a;
    }
    public void setA(int a){
        this.a=a;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
          this.name=name;
        }
    }  
class Text{
    public static void main(String args[]){
        Encapsulation e=new Encapsulation();
        e.setA(12);
        e.setName("Ismriti");
        System.out.println("The value of A is:"+e.getA());
        System.out.println("My name is :"+e.getName());
    }
}
