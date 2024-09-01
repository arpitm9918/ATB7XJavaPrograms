package august.ex04082024.multiLevelInheritance;

public class lab173 {
    public static void main(String[] args) {
        // Multilevel Inheritance
        // Grandfather --> Father --> Child
        Child c1 = new Child();
        c1.home();// if name is same C--> F--> Grandfather
        c1.GrandF();//if name is different then it access anyone
    }
}
