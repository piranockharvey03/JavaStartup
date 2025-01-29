/*Write a BankAccount class that has attributes for accountNumber, balance, and
ownerName. Implement methods to deposit, withdraw, and check balance. Add a feature
to prevent overdraft */

import java.util.*;

class BankAccount{
    int accountNumber=4141;
    int accountpin=1234;
    final double accountBalance=50000;
    String ownerName="JANE";
    

    public double deposit(double depositedAmount, double accountBalance){
        if (depositedAmount>5000000){
            System.out.println("You can not deposit more 5000000UGX at ONCE");
        }
        double AccountBalanceNow=depositedAmount + accountBalance; 
        return  AccountBalanceNow;
    }

    public double withdraw(double withdrawnAmount, double accountBalance){
        if (accountBalance < 5000){
            System.out.println("You have insufficient balance");
            System.out.println("You can not make a Withdraw");
        }
        double AccountBalanceNow= accountBalance-withdrawnAmount; 

        return  AccountBalanceNow; 
    }
    
    public void Balance( double accountBalance){
        System.out.println("Your acount balance is:" + accountBalance);
    }
}

public class Question11{
    public static void main(String[] args){

        BankAccount Customer = new BankAccount();
        Scanner Money = new Scanner(System.in);

        
        System.out.println("PLEASE ENTER YOUR ACCOUNT NUMBER");
        int theaccountNumber=Money.nextInt();

        System.out.println("PLEASE ENTER YOUR ACCOUNT PIN CODE");
        int theaccountpin=Money.nextInt();
        
        if(theaccountNumber==Customer.accountNumber&&theaccountpin==Customer.accountpin){

            System.out.println("WOULD YOU WANT TO ");

            System.out.println("1.DEPOSIT:");      
            System.out.println("2.WITHDRAW:");
            System.out.println("3.CHECK ACCOUNT BALANCE:");
            int choice = Money.nextInt(); 

            if(choice==1){
                System.out.println("Amount to Deposit (UGX)");
                double toDeposit= Money.nextDouble();
    
    
               System.out.println("You have deposited:"+toDeposit);
               System.out.println("Dear"+" " + Customer.ownerName+" "+"your Account Balance now is now:"+ Customer.deposit(toDeposit, Customer.accountBalance));
    
            }
            if (choice==2){
                System.out.println("Amount to Withdraw (UGX)");
                double towithdraw = Money.nextDouble();
    
                System.out.println("You have withdrawn:"+towithdraw);
                System.out.println("Dear"+" " + Customer.ownerName+" "+"your Account Balance now is now:"+ Customer.withdraw(towithdraw,Customer.accountBalance));
    
            }
    
            if (choice==3){
                System.out.println("Dear"+" " + Customer.ownerName+" "+"your Account Balance is:"+Customer.accountBalance);
                
            }
        }
        else {
            System.out.println("WRONG ACCOUNT NUMBER OR PIN CODE!");
        }
       
    }
}
//written by Harvey
//I was inpsired and decided make a simple Automated Teller Machine program kindof program