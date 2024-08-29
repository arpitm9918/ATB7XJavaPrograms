package aug_ex04082024;

public class lab170 {
    public static void main(String[] args) {
        // Below code use DC
        BankAccount bank1= new BankAccount();
//        System.out.println(bank1.BankName);
//        System.out.println(bank1.balance);
//        System.out.println(bank1.bankcode);

        BankAccount BankICICI = new BankAccount();// 1.this will call first DC that replace null value of variables
// line 11 and 12 before PC.
       // System.out.println(BankICICI.BankName);//here name will be SBI it will chnage after creating PC for this bank

        // Below code use PC

        BankAccount BankHDFC = new BankAccount("HDFC",0,"HDFC001");
//        System.out.println(BankHDFC.BankName);
//        System.out.println(BankHDFC.balance);
//        System.out.println(BankHDFC.bankcode);
        //PC are use to initialize these values with default value before staring the program

        BankHDFC.printdetails();
        bank1.printdetails();
    }
}
