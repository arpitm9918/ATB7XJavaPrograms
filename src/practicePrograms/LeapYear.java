package practicePrograms;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Year Will let you Know the Year is leap year or Not:---");
        int Year= sc.nextInt();
        if(Year % 4==0  ) {
            System.out.println(Year + ":-- is leap year");
        }else {
            System.out.println(Year+":-- is not a leap Year");
        }if (Year%100==0 && Year%400==0){
            System.out.println(":-- Year is Leap");
        }else{
            System.out.println(":-- Year is Centuary");
        }
        }

    }


