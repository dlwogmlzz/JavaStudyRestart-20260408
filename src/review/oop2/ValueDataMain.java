package review.oop2;

// 자바같은 객체 지향 언어는 클래스 내부에 속성(데이터), 기능(메서드)을 함께 포함시킬 수 있다.(멤버변수 + 메서드)
public class ValueDataMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        add(valueData);
        add(valueData);
        add(valueData);
        System.out.println("최종 숫자=" + valueData.value);
    }

    static void add(ValueData valueData) {
        valueData.value++;
        System.out.println("숫자 증가 value = " + valueData.value);
    }
}
