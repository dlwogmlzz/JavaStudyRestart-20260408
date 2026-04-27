package review.oop2;


// 객체지향은 응집력이 있다.
// 하나의 클래스로 속성과 기능을 모두 관리..
public class ValueData {

    /*데이터인 value와 해당 데이터를 사용하는 기능인,
    * add()메서드를 함께 정의 했다.*/
    int value;

    /*static이 안붙었다???
    * 메서드는 원래 객체를 생성해야 호출을 할수 있는데,
    * static이 붙으면 객체를 생성하지 않고도 메서드 호출을 할수 있다.
    * */
    void add() {
        value++;
        System.out.println("숫자 증가 value = " + value);
    }
}
