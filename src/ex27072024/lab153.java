package ex27072024;

public class lab153 {
    public static void main(String[] args) {
        // String -- Immutable in nature
        // Use two Class String Buffer, String Builder both are mutable in nature
        String S1= "Arpit";
        S1="Mishra"; // Here in String Pool two string is there one is Arpit and 2nd is Mishra
        System.out.println(S1);
        StringBuffer Stringbuffer = new StringBuffer("Arpit");
        Stringbuffer.append("Mishra");// ArpitMishra Here only 1 sting store
        System.out.println(Stringbuffer);

        StringBuilder Stringbuilder = new StringBuilder("Mishra");
        Stringbuilder.append("Arpit");
        Stringbuilder.append("Ji");
        System.out.println(Stringbuilder);
        // String Buffer and builder save memmory wastage.

        //Thread Safety (Avoid in Automation untill it required)

        // String builder -- not therad safe -- people love it

        // Key Diff b/w StringBuffwe and StringBuilder is :-
        //String Buffer Synchronized hota hai it mean each operation one by one kiya jayega
        //String builder Non Synchronized hota hai
        //StribgBuffer Slow hota hai
        //String builder fast hota hai


    }
}
