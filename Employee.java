class Employee{
    public static int base = 1000;
    int salary(){
        return base;
    }
}
class Manager extends Employee{
    int salary(){
        return base +200000;
    }
}
class Clerk extends Employee{
    int salary(){
        return base +100000;
    }
}
class Main{
    static void printSalary(Employee e){
        System.out.println(e.salary());
    }
    public static void main(String[]args){
        Employee obj1=new Manager();
        System.out.print("Manager's salary:");
        printSalary(obj1);
        Employee obj2=new Clerk();
        System.out.print("clerk's salary:");
        printSalary(obj2);
    }
}