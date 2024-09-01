package july.ex28072024;

public class Animal {
    String Name;
    int Age;

    void walk(){
        System.out.println("Animal can walk");
    }
    void talk(){
        System.out.println("Animal can talk");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.Name="Liom";
        animal.Age=90;
        animal.walk();
        animal.talk();
    }
}
