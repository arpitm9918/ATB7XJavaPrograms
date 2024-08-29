package aug_ex04082024; //LAb 170 use this.

public class BankAccount {
    String BankName;
    int balance;
    String bankcode;
//Above variables are called Instance Variable
    //DC
    BankAccount(){
        BankName = "SBI";
        balance=100;
        bankcode="SBIN0099";
    }
    //PC --> this is PC with 3 arguments
    BankAccount(String BankName, int balance, String bankcode){
        this.BankName=BankName;
        this.balance= balance;
        this.bankcode= bankcode;

    }
    // this is PC with 2 arguments
    BankAccount(String BankName, int balance){
        this.BankName=BankName;
        this.balance= balance;
        this.bankcode= bankcode;

    }
    // this is PC with 1 arguments
    BankAccount(String BankName){
        this.BankName=BankName;
        this.balance= balance;
        this.bankcode= bankcode;

    }
    void printdetails(){
        System.out.println("Bank Name :->" +BankName);
        System.out.println("Bank Balance :->" +balance);
        System.out.println("Bank Code :->" +bankcode);
    }
}
