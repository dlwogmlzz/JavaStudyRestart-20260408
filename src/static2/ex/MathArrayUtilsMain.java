package static2.ex;

import static static2.ex.MathArrayUtils.*;

public class MathArrayUtilsMain {

    public static void main(String[] args) {
        // 객체를 만들어서 쓰면 메모리 낭비임...
        // 그래서 생성을 못하게 하려면 접근제어자를 private로 바꿔줘야 됌..
        // static메서드를 .으로 바로 불러쓰면 됌.



        int [] values = {1, 2, 3, 4, 5};
        System.out.println("sum=" + sum(values));
        System.out.println("average=" + average(values));
        System.out.println("min=" + min(values));
        System.out.println("max=" + max(values));
    }
}
