package august.ex10082024.polymor.methodoverloading;
//Compiletime/Method overloading/ Static Polymorphism
// Here add method is overloaded
// beacuse by using add we are performing different operation


public class MathOperations {
 //Encapsulation
 private  String Name;

 public String getName() {
  return Name;
 }

 public void setName(String name) {
  Name = name;
 }

 //MethodOverloading

 int add (int a, int b) {
        return a+b;
    }
    double  add(double a, double b){
       return a+b;
    }
    String add(String a, String b){
        return a+b;
    }
}
