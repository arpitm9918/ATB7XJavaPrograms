package july.ex27072024;

import java.util.Scanner;

public class lab139 {
    public static void main(String[] args) {
        // Arrays -> new
        Scanner sc = new Scanner(System.in);// use to take input from user
        int[] marks = new int[3]; //default value is set 0
        // index - 0,1,2
        // len - 3
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        System.out.println("Enter the numbers:- ");

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
//        System.out.println(marks[10]); // AIOBE


        boolean[] is_married = {true, false, true};
        // To Print

        for (int i = 0; i < marks.length; i++) {
            // i = 0,1,2
            System.out.println(i + " -> " + marks[i]);
            //marks[i]= sc.nextInt();
        }


        String weekDays[] = {"Sunday", "Monday", "Tuesday", "Wednesday"};
        for (int i = 0; i < weekDays.length; i++) {
            System.out.println(weekDays[i]);
        }
    }
}
