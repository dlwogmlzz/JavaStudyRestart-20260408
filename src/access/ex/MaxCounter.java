package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    // 생성자, 해당 클래스는 다른 패키지에서도 사용할 수 있어야 한다.
    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        // 검증 로직
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return; // 나감.
        }
        // 실행 로직
        count++;

//        if (count >= max) {
//            System.out.println("최대값을 초과할 수 없습니다.");
//        } else {
//            count++; // return을 지우고 이런식으로 작성해도 된다.
//        }
    }

    public int getCount() {
        return count;
    }
}
