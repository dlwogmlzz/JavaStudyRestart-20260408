package review.static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        // 인스턴스는 객체를 생성해서 참조값을 알아야 사용할 수 있다.
        // instanceValue++;    // 인스턴스 변수 접근, compile error
        // instanceMethod();   // 인스턴스 메서드 접근, compile error

        staticValue++;  // 정적 변수 접근
        staticMethod(); // 정적 메소드 접근
    }

    public static void staticCall(DecoData data) {  // 매개변수를 통해 외부에서 참조값을 넘겨옴.
        data.instanceValue++;
        data.instanceMethod();
    }

    public void instanceCall() {
         instanceValue++;    // 인스턴스 변수 접근, compile error
         instanceMethod();   // 인스턴스 메서드 접근, compile error

        // static은 어디든 접근 가능
         staticValue++;  // 정적 변수 접근
         staticMethod(); // 정적 메소드 접근
    }

    private void instanceMethod() {
        System.out.println("instanceValue=" + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }
}
