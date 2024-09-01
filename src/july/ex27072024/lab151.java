package july.ex27072024;

public class lab151 {
    public static void main(String[] args) {
        int array_2D [][] = {
                {23,32,35},
                {32,45,67},
                {54,45,65},
        };
        //Rows - 3 i->o to 2
        //cols - 3 j->o to 2
        for (int i = 0; i < array_2D.length; i++) {
            for (int j = 0; j < array_2D[i].length; j++) {
                System.out.print(array_2D[i] [j]);
                System.out.print(" ");
                //System.out.println("");
                
            }
            System.out.println("");
            
        }
    }
}
