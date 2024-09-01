package july.ex27072024;

public class lab145 {
    public static void main(String[] args) {
//                        System.out.println(args[2]); // we can pass args by clicking on 3 dots above in program arguments.
//                        System.out.println(args.length);
//        if (args.length > 4){
//            System.out.println(args[2]);
//        }else {
//            System.out.println(args[1]);
//        }

        if (args.length > 0) {
            for (int i = 0; i < args.length ; i++) {
                System.out.println(args[i]);
            }

        }else{
            System.out.println("No Arguments given");
        }
    }
}
