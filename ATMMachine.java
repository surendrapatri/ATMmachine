import java.util.*;
class ATM{
    float Balance;
    String myname="surendra";
    int Pin=5674;
    
    public void checkpin(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your username:");
		String name=sc.nextLine();
        System.out.println("enter your pin:");
       // Scanner sc=new Scanner(System.in);
        int enteredpin=sc.nextInt();
         if(myname.equals(name)){
            menu();
        }
        else{
            System.out.println("enter a valid username");
           // menu();
        }
        if(enteredpin==Pin){
            menu();
        }
        else{
            System.out.println("enter a valid pin");
           // menu();
           return;
        }
    }
    
    public void menu(){
        System.out.println("enter your choice:");
        System.out.println("1.check balance");
        System.out.println("2.withdraw");
        System.out.println("3.deposit");
        System.out.println("4.Transfer");
        System.out.println("5.exit");
        
        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();
        
        if(opt==1){
            checkBalance();
        }
        else if(opt==2){
            withdrawMoney();
        }
        else if(opt==3){
            depositMoney();
        }
         else if(opt==4){
            transfer();
        }
        else if(opt==5){
            return;
        }
        else{
            System.out.println("enter a valid choice");
        }
    }
    public void checkBalance(){
        System.out.println("Balance:"+Balance);
        menu();
    }
    public void withdrawMoney(){
     System.out.println("enter amount to withdraw:");
     Scanner sc=new Scanner(System.in);
     float amount=sc.nextFloat();
     if(amount>Balance){
         System.out.println("insufficiant balance");
     }
     else{
         Balance=Balance-amount;
         System.out.println("money withdraw successfully");
     }
     menu();
    }
    public void depositMoney(){
        System.out.println("enter the amount:");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        Balance=Balance+amount;
        System.out.println("money deposited successfully");
        menu();
    }
    public void transfer()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the account number of receiver:");
    int num=sc.nextInt();
    System.out.println("enter the amount:");
      float amo=sc.nextInt();
      Balance=Balance-amo;
       System.out.println("send money successfully");
    }
}

public class ATMMachine{
    public static void main(String[] args){
        ATM obj=new ATM();
        obj.checkpin();
    }
}
