package august.ex04082024;

import java.util.Scanner;

public class TakeDetailsFromUserPC {
    public static void main(String[] args) {
     // BankAccount PNB = new BankAccount(BankName,balance, bankcode);
      //  BankAccount LKO = new BankAccount()
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bank Name");
        String BankName = sc.next();
        System.out.println("Enter Bank Balance");

        int balance= sc.nextInt();
        System.out.println("Enter Bank Code");

        String bankCode = sc.next();
        BankAccount PNB = new BankAccount(BankName, balance,bankCode);
      //  BankAccount PNB= new BankAccount(BankName, balance, bankCode);

        PNB.printdetails();
    }
}
