import java.awt.*;

public class LAB_4_1_2 extends Point {

    String name;
    int z =0;
    int w =0;

    public LAB_4_1_2(int x, int y, int z, int w) {
        super(x, y);
        this.z=z;
        this.w=w;


    }

    public static void main(String[] args) {
        LAB_4_1_2 lab_4_1_2 = new LAB_4_1_2(5,5,7,6);
        System.out.println("x wynosi " + lab_4_1_2.x);
        System.out.println("y wynosi " + lab_4_1_2.y);
        System.out.println("z wynosi " + lab_4_1_2.z);
        System.out.println("w wynosi " + lab_4_1_2.w);

    }

}
