package ex27072024;

import java.util.Scanner;

public class lab144 {
    public static void main(String[] args) {
        int[] int_array = {34,45,43};
        long[] l_array  = {34l, 45l,43l};
        float[] f_array = {45.56f, 32.34f, 43.43f};
        double[] d_array = {34.3, 43.4, 12.32};
        boolean[] b_array = {true,false,true,false};
        char[] c_array = {'A','B','D'};
        //System.out.println(int_array);
       // System.out.println(l_array);

        String names[] = {"Pramod","Amit","Alok"};
        String[] args1 = {"Pramod","Amit","Alok"};
        Scanner sc = new Scanner(System.in);
        int ages[] = new int[4];
        for(int i=0; i<ages.length; i++){
            System.out.println("Enter the numbers"+ i);
           ages [i] = sc.nextInt();
            System.out.println("the age is"+ ages[i]);
        }
        System.out.println("Enter the numbers");
        //ages [i] = sc.nextInt();
        //System.out.println("the age is"+ i);

        //System.out.println("Enter the numbers");

        int[] ages1 = new int[4];
    }
}
