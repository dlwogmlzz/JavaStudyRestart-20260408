package review.memory;

public class JavaMemoryMain1 {
    public static void main(String[] args) {
        System.out.println("main Start");
        method1(10);
        System.out.println("main End");
    }

    static void method1(int m1) {
        System.out.println("method1 Start");
        int cal = m1 * 10; // 매개변수로 넘어온 값을 2배로 만듦.
        method2(cal);
        System.out.println("method1 End");
    }

    static void method2(int m2) {
        System.out.println("method2 Start");
        System.out.println("method2 End");
    }
}
