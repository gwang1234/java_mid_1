package mid_1.lang.string.equals;

public class StringEqualsMain2 {

    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("메서드 호출 비교1: " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교2: " + isSame(str3, str4));
    }

    public static boolean isSame(String x, String y) {
        //return x == y;
        // 어떤 문자가 들어올지 모르기 때문에 동등성을 비교하는 equals를 쓰자
        return x.equals(y);
    }
}
