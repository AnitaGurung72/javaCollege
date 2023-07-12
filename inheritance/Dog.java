public class Dog{
    void eat(){
        System.out.println("eating...");    
    }
}
class Mediumdog extends Dog{
     void bark(){
        System.out.println("barking..");
    }
}
class Babydog extends Mediumdog{
    void weep(){
        System.out.println("weeping..");
    }
}
class MultInheritance{
    public static void main(String args[]){
       Babydog A=new Babydog();
       A.weep();
       A.bark();
       A.eat();
    }
}

    