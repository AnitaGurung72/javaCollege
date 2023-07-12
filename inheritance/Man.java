public class Man{
     void eat(){
        System.out.println("eating...");    
    }
}
class Ram extends Man{
     void sing(){
        System.out.println("singing..");
    }
}
class Sita extends Man{
     void read(){
        System.out.println("reading..");
    }
}
class HierarchialInheritance{
    public static void main(String args[]){
        Sita S=new Sita();
        S.read();
        S.eat(); 
    }
}


    