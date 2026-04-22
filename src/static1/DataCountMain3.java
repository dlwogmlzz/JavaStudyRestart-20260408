package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A"); // Data3(클래스) data1(객체 변수)
        System.out.println("A count = " + Data3.count); // 클래스에 .으로 직접접근

        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.count); // 클래스에 .으로 직접접근

        Data3 data3 = new Data3("C");
        System.out.println("C count = " + Data3.count); // 클래스에 .으로 직접접근

        // 추가, 인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println("인스턴스로 접근 : " + data4.count); // 인텔리제이에서 좋지 않은 코드는 노란줄 표시해줌.
        // 인스턴스 접근은 권장하지 않음..

        // 클래스를 통한 접근
        System.out.println("클래스로 접근 : " + Data3.count);

    }
}
