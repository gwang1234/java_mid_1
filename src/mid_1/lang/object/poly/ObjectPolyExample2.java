package mid_1.lang.object.poly;

public class ObjectPolyExample2 {

    public static void main(String[] args) {
        Car car = new Car();
        Dog dog = new Dog();
        Object o = new Object(); // Object 인스턴스도 만들 수 있다

        Object[] objects = {dog, car, o};

        size(objects);
    }

    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수는: "+ objects.length);
    }
}
