package august.ex04082024;

public class lab167 {
    public static void main(String[] args) {
        ATBPerson p1 = new ATBPerson( "Arpit");
        ATBPerson p2 = new ATBPerson("Mishra");
        ATBPerson p3 = new ATBPerson("Mishra", 9414143872l);
        System.out.println(p1.Name);
        System.out.println(p2.Name);
        System.out.println("Name"+p3.Name+ ",Phone"+p3.phone);
    }
}
