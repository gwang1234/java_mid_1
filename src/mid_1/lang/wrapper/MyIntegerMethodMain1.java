package mid_1.lang.wrapper;

public class MyIntegerMethodMain1 {

    public static void main(String[] args) {
        int valeu = 10;
        int i1 = compareTo(valeu, 5);
        int i2 = compareTo(valeu, 10);
        int i3 = compareTo(valeu, 20);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
    }

    public static int compareTo(int value, int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }
}
