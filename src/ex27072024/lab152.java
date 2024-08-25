package ex27072024;

public class lab152 {
    public static void main(String[] args) {
        //String -- bunch of characters
        // there is two way to create string 1. By creating object
        //                                     2. By assigning them directly
        String S1 = new String("Arpit");//  it us creatd by object in this string store in
                                              // Heap Area
        String S2 = "Mishra"; //In this string store in Sting constant pool
        //Strings -- Immutable in nature
        System.out.println(S1.length());
        System.out.println(S1.indexOf('t'));
        System.out.println(S1.toLowerCase());
        System.out.println(S1.charAt(3));
    }
}
// Most of the time String is not use in automation