public class Averager {
    public static void main(String[] args) {
        int sum = 0 ;
        if (args.length >0) {

            for (int i =1; i<args.length; i++){
                sum += Integer.parseInt(args[i]);
            }
            System.out.println("Suma wynosi: "+ sum);
            System.out.println("Srednio wynosi: "+ (double)sum/args.length);

        } else {
            System.out.println("Brak argumentów programu!");
        }
    }

}
