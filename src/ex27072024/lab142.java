package ex27072024;

public class lab142 {
    public static void main(String[] args) {
        final int[] ages = new int[4];// In array final keyword is use to final the length. here length is 4
        //above we can not change the lengh of array.
        ages[3] = 78;
        System.out.println(ages[3]);

        final int a = 10;
        //a = 90;
    }
}
