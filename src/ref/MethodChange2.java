package ref;


// Java에서는 항상 값을 복사해서 대입한다!!!!
// 하지만 그 값이 실제 값이냐, 참조(메모리 주소)값이냐에 따라 동작이 달라진다.
// ※메서드로 참조형 데이터를 전달하면, 참조값이 복사되어 전달된다.
// 메서드 내부에서 매개변수(파라미터)로 전달된 객체의 멤버 변수를 변경하면, 호출자의 객체도 변경된다.

public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value);
        System.out.println("dataA = " + dataA);
        changeReference(dataA);
        System.out.println("메서드 호출 후: dataB.value = " + dataA.value);
    }

    static void changeReference(Data dataX) {
        System.out.println("dataX = " + dataX);
        dataX.value = 20;
    }
}
