package final1;

public class FinallLocalMain {
    public static void main(String[] args) {
        // final 지역 변수
        final int data1;
        data1 = 10; // 최초 한번만 할당 가능
        // data1 = 20; // 컴파일 오류..

        // final 지역 변수 2
        final int data2 = 10; // 선언, 초기화
        // data2 = 20; // 컴파일 오류..
        method(10);
    }

    static void method(final int parameter) { // parameter에 10이 들어가있는상황
        // parameter = 20: // 컴파일 오류, 값 변경 불가능..
    }
}
