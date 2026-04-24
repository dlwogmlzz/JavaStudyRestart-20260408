package review.ref2;

// 기본형 메서드 호출
public class MethodChange1 {
    public static void main(String[] args) {
        int a = 100;
        System.out.println("메서드 호출 전 a = " + a);    // 100
        changePrimitive(a);
        System.out.println("메서드 호출 후 a = " + a);    // 100
    }

    public static void changePrimitive(int x) {
        x = 200;
        System.out.println("메서드 내부 x = " + x);
    }
}
