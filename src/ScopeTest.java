/*
import java.awt.*;

public class ScopeTest {

    int test  = 10 ;
    Point point = new Point(1,3);

   void  changePoint(Point point){
       point.x=5;
       point.y = 5;

   }

   void changeTest(int test){
       test = 5;
   }

    void printTest ( ){

        int test =20;
        System.out.println("test= " + this.test);
    }

    public static void main(String[] args) {
        ScopeTest ScopeTest = new ScopeTest();
      //  ScopeTest.printTest();
        System.out.println("test: " + ScopeTest.test);
        System.out.println("test: " + ScopeTest.point);
        ScopeTest.changeTest();
    }

}


*/
