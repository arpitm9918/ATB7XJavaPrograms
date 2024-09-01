package august.ex04082024;

public class lab164 {
    int e = 45;//Instance variable != global variable
    void f1(){
        int e= 24;//Local variable
        System.out.println(e);// this will print local
    }
    void f2(){
        System.out.println(e);// this will print instance
    }
}
