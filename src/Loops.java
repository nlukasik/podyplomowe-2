public class Loops {
    public static void main(String[] args) {

       /* for (int i=1; i<100; i++) {
            System.out.println("i = " + i);
        }*/
       final String FORBIDEN = "dwa";
        String [] strings = {"raz", "dwa", "trzy"};
       int i =0;

        System.out.println("------------------------------START");
      while(i < strings.length){
          if (strings[i].equals(FORBIDEN)){
              continue;
          }
          System.out.println(strings[i]);

      }
        System.out.println("-----------------------------KONIEC");
    }
}