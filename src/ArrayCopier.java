public class ArrayCopier {

    public static void main(String[] args) {
        int[] arrayIn = {7, 4, 8, 1, 4, 1, 4};
        double [] arrayOut = new double[arrayIn.length];

        System.out.print("arrayIn: [");
        int counter =0;

        while (counter <arrayIn.length && arrayIn[counter]!=1) {
            arrayOut[counter] = (double) arrayIn[counter]; //niejawna konwersja typów
            System.out.print(arrayOut[counter] + " ");
            ++counter;
        }


        System.out.println("]");

    }
}
