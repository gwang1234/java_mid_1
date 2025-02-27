package mid_1.lang.string.method;

public class StringUtilsMain2 {

    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String str = "Hello, Java!";

        // format 메서드
        String format = String.format("num: %d, bool: %b, str: %s", num, bool, str);
        System.out.println("format = " + format);

        // matches 메서드
        String regex = "Hello, (Java!|World)";
        System.out.println("'str'이 패턴과 일치하는가? " + str.matches(regex));
    }
}
