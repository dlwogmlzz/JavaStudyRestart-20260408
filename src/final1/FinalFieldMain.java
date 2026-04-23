package final1;

import java.sql.SQLOutput;

public class FinalFieldMain {

    public static void main(String[] args) {
        // final필드 - 생성자 초기화
        System.out.println("생성자 초기화");
        // final은 생성자를 통해서만 값을 한번 셋팅할수 있고, 그이후로는 값을 변경할 수 없다.
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        // final필드 - 필드 초기화
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();

        // 값이 중복이 돼서 메모리 낭비..
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);

        // 상수 접근
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);

        // final + 필드 초기화를 사용하는 경우 static을 붙여서 사용하는 것이 효과적이다.
    }
}
