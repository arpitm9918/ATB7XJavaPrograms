package practicePrograms;

public class Today1 {

    Today1(){
        System.out.println("constructor");

    }
    Today1(int a){

        System.out.println("parameter constructor"  +a );
    }
    static{
        System.out.println("static block");
    }
    public void sub(){
        System.out.println("method");
    }
    public static void main(String[] args) {
        Today1 a = new Today1(2);
       // a.sub();
    }

}
