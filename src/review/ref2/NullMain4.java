package review.ref2;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();

        // 참조객체를 생성하면 해결된다.
        bigData.data = new Data();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        // NullPointerException
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}
