package august.ex10082024.polymor.methodoverriding;

public class lab181 {
    public static void main(String[] args) {
        Hound h1= new Hound();
        h1.Bark();//local priority

        Dog d1 = new Dog();
        d1.Bark();

        Dog dog_ref = new Hound();// Parent reference with child is absolutely possible here dog is parent
        dog_ref.Bark();//which one is called is decide at runtime

     //   Hound n1 = new Dog();//it is not possibel
    }
}
