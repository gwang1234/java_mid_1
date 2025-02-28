package lang.wrapper;

public class AutoboxingMain2 {

    public static void main(String[] args) {
        //Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value;

        //Wrapper -> Primitive
        int unboxedValue = value;

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
