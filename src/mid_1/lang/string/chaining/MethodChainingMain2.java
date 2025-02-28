package mid_1.lang.string.chaining;

public class MethodChainingMain2 {

    public static void main(String[] args) {
        ValueAdder valueAdder = new ValueAdder();
        ValueAdder adder1 = valueAdder.add(1);
        ValueAdder adder2 = valueAdder.add(2);
        ValueAdder adder3 = valueAdder.add(3);

        int result = adder3.getValue();
        System.out.println("result = " + result);

        System.out.println("result = " + adder1);
        System.out.println("result = " + adder2);
        System.out.println("result = " + adder3);
    }
}
