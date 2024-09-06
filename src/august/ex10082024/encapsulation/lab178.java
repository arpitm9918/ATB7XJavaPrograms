package august.ex10082024.encapsulation;

public class lab178 {
    public static void main(String[] args) {
        ICICIBank iciciBank = new ICICIBank("Arpit", 100);
        iciciBank.setName("PNB");
        System.out.println(iciciBank.getName());
        iciciBank.setBalance(10000, true);
        System.out.println(iciciBank.getBalance());
        //set the balance and name
    }
}
