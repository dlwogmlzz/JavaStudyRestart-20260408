package review.final1;

public class FieldInit {

    static final int CONST_VALUE = 10;      // final변수명은 대문자가 관례
    final int value = 10;       // 초기값을 넣은 순간, 생성자를 통해서 다시 값을 넣을 수 없다.

   /* public FieldInit(int value) {
        // this.value = value; // 오류.
    }*/

}
