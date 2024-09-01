package july.ex27072024;

public class lab148 {
    public static void main(String[] args) {
        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};

        // Initialize variables
      //  int max = Integer.MIN_VALUE;
        int max = salaries[0];
        int secondMax = salaries[0];
      //  int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < salaries.length; i++) {
            // Update max and second max
            if (salaries[i] > max) {
                secondMax = max;
                max = salaries[i];
            } else if (salaries[i] > secondMax && salaries[i] != max) {
                secondMax = salaries[i];
            }
        }

        System.out.println("Max salary: " + max);
        System.out.println("Second max salary: " + secondMax);
    }
}
