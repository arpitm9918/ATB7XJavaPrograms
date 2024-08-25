package ex27072024;

public class lab149 {
    public static void main(String[] args) {
        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};
        int first_Highest_Salary= salaries[0];
        int second_Highest_Salary= salaries[0];
        for(int i=0; i < salaries.length; i++){
            if(salaries[i]> first_Highest_Salary){
                first_Highest_Salary=salaries[i];
            }
            if(salaries[i]> second_Highest_Salary){
                second_Highest_Salary=salaries[i];
            }
            System.out.println("first highest salary"+ first_Highest_Salary);
            System.out.println("second highest salary"+ second_Highest_Salary);
        }
    }
}
