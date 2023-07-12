class MinBalanceException extends Exception{
    public MinBalanceException(){
        System.out.println("Balance is low");
    }
}
public class UserDefineExample{
    public static void main(String[]args){
        try{
            int acc[]={10,11,12,13,14,15};
            double balance[]={900,2000,1500,1768,50};
            for(int i=0;i<5;i++){
                System.out.println("Account No:"+acc[i]+""+" Balance:"+balance[i]);
                if(balance[i]<1000){
                    throw new MinBalanceException();
                }
            }
         }catch(MinBalanceException e){
        System.out.println("Exception caught");
       }
     }
}