package JungSuk;
// x와 y값 교환
public class VarEx2 {
    public static void main(String[] args) {
        /*
        * 1. int(변수타입) age(변수이름)
        * ①변수타입 - 어떤 값을 저장할 것인가?
        * ②변수이름 - 알기 쉽고 의미 있는걸로.
        * */
        int x = 10;
        int y = 20;
        int tmp; // 빈컵

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }
}
