package enumeration.ex2;

public class ClassGradeEx2_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        // 객체를 생성하면 참조값 비교를 못함 -> 오류
        // 문제를 해결하면 기본생성자를 private으로 변경
        //ClassGrade newClassGrade = new ClassGrade();
        //int result = discountService.discount(newClassGrade, price);
        //System.out.println("newClassGrade 등급의 할인 금액: " + result);
    }
}
