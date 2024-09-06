package august.ex10082024.polymor.methodoverloading;

public class lab179 {
    //Polymorphism
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();

       int result= mathOperations.add(2,6);
        System.out.println(result);
        String result1 = mathOperations.add("Arpit", "Mishra");
      //  String result3 = mathOperations.add("Arpit", 5);//here we are getting error at compile time that's why it is called compiletime polymorphism.
        double result2= mathOperations.add(20.5, 30.5);
        System.out.println(result1);
        System.out.println(result2);
    }

}
