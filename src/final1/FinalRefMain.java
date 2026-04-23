package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(); // 참조형
        // data = new Data();

        // 참조 대상의 값은 변경 가능하다.
        // 변수에 들어 있는 값만!!!! 변경못한다.
        data.value = 10;
        System.out.println(data.value);
        data.value = 100;
        System.out.println(data.value);
    }
}
