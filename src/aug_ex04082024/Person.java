package aug_ex04082024;

public class Person {
    String  Name;
    //Special Method Constructor -- same name as class name
    // automatically when object is created
    //this is default constructor
    Person(){
        System.out.println("I will Ayutomatically called when object is created");
    }
    void talk(){
        System.out.println("I can Talk");
    }
}
