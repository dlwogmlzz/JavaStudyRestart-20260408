package static2;

// 인스턴스는 참조값으로 접근,
public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() { // 클래스소속임.. static만 접근가능!!
        // 인스턴스는 객체를 생성해야 사용할 수 있다.
        // instanceValue++;    // 인스턴스 변수 접근 불가능, compile error
        // instanceMethod();  // 인스턴스 메서드 접근 불가능, compile error

        staticValue++;      // 정적 변수 접근
        staticMethod();    // 정적 메서드 접근
    }

    // 외부에서 참조값(data)을 넘겨옴..
    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }

    public void instanceCall() {
         instanceValue++;       // 인스턴스 변수 접근가능
         instanceMethod();     // 인스턴스 메서드 접근가능

        staticValue++;      // 정적 변수 접근가능
        staticMethod();    // 정적 메서드 접근가능
    }

    private void instanceMethod() {
        System.out.println("instanceValue=" + instanceValue);
    }

    // 정적메서드는 참조값 없이 호출 가능하다.
    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }
}
