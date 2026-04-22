package static2;
// static import도 가능함..
//import static static2.DecoData.staticCall;
import static static2.DecoData.*;

public class DecoDataMain {

    /*
    * main메서드는 정적메서드(static)이기 때문에, 정적메서드만 호출할 수 있다.
    * 만약에 static이 아니면 인스턴스(객체)를 생성해야 호출할 수 있다.
    * */
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        // 클래스. 을 생략가능..
        DecoData.staticCall(); // import있어도 이렇게 써도 됌.
        staticCall();
        staticCall();
        staticCall();
        staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        // 추가
        // 인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.staticCall();

        // 클래스를 통한 접금
        staticCall();
    }
}
