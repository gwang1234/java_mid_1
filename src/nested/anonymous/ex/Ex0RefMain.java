package nested.anonymous.ex;

public class Ex0RefMain {

    public static void helloSpring(String l) {
        System.out.println("프로그램 시작");
        System.out.println("Hello " + l);
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        helloSpring("Java");
        helloSpring("Spring");
    }
}
