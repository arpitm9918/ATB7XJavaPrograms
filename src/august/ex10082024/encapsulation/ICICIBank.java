package august.ex10082024.encapsulation;//lab 178

public class ICICIBank {
    private String Name;
    private long Balance;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getBalance() {
        return Balance;
    }

    public void setBalance(long balance, boolean isAdmin) {
        if (isAdmin){
        Balance = balance;
        }
        else {
            System.out.println("Not Admin");
        }
    }

    public ICICIBank(String name, long balance) {
        Name = name;
        Balance = balance;
    }
}
