package july.ex21072024;

import java.util.Scanner;

public class lab134 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number :- ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBUzz"+ i);
            } else if (i%3==0) {
                System.out.println("Fizz"+ i);
            } else if (i%5==0) {
                System.out.println("Buzz"+ i);
            }else System.out.println(i);
        }
    }
}
