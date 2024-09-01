package july.ex28072024;

public class lab158 {
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        Bank bank2 = new Bank();
         bank1.Name="SBI";
         bank2.Name="ICICI";

        System.out.println(bank1.Name);
        System.out.println(bank2.Name);
        System.out.println(bank1.Balance);
        bank2.Balance=10000;
        System.out.println(bank2.Balance);
    }
}
