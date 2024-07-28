package ex27072024;

public class lab143 {
    public static void main(String[] args) {
        // Disadvantage of array
        //1. Fixed Data Type (homo)
        //2.  Fixed Length.
        // 3. wastage of memory
        int [] ages = new int[100];
        ages[1]  = 99;
        ages[1]  = 100;
        System.out.println(ages[1]); // 0 99 00000000...
    }
}
