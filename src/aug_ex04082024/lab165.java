package aug_ex04082024;

import org.w3c.dom.ls.LSOutput;

public class lab165 {
    int age2 = 45;//Instance variable != global variable
    void f1(){
        int age1= 24;//Local variable
        System.out.println(age2);
    }
//    void f2(){
 //       System.out.println(age1);// it can not use local varibale
        // beacuse loacal varibale have a scope is within in a function
 //   }
}
