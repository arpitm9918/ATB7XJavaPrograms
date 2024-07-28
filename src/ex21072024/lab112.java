package ex21072024;

public class lab112 {
    public static void main(String[] args) {
        final boolean b1 = true;
        // b1 = false; final this is fixed now
//        for (int i=0;b1;i++){
//            System.out.println("Hello");
//        }
// it also run infinite times
//        for (int i=0;;){
//            System.out.println("Hello");
//        }
// if condition not define in for loop then it will run infinite times
//        for (;;){
//            System.out.println("Hello");
//        }

        for(float f=0.0f;f<10.67;f++){
            System.out.println("Hi,Floatg -> "+ f);
        }

        for(byte f=0;f<=10.67;f++){
            System.out.println("Hi,Float -> "+ f);
        }
    }
}
