package ref;

public class NullMain2 {

    public static void main(String[] args) {
        Data data = null; // 여기서 부터 null인 상태임..
//        Data data = new Data(); // 이런식으로 제대로 객체를 생성해주면 값이 뜬다.
        data.value = 10; // NullPointerException 예외 발생

        System.out.println("data = " + data.value);


    }
}
