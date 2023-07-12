interface Bank{
    float rateofInterest();
}
class NIC implements Bank{
    public float rateofInterest(){
        return 9.22f;
    }
}
class sanima implements Bank{
    public float rateofInterest(){
        return 9.7f;
    }
}
class TestInterface2{
    public static void main(String[]args){
        Bank b=new sanima();
        System.out.println("ROI:"+b.rateofInterest());
    }
}