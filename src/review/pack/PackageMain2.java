package review.pack;

// import하면 생성자 호출할때 생략가능
//import pack.a.User;
//import pack.a.User2;
import pack.a.*;    //pack.a의 모든 클래스를 사용할 수 있다.

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data(); // 같은 패키지..
//        pack.a.User user = new pack.a.User();   // 다른 패키지..
        User user = new User();
        User2 user2 = new User2();
    }
}
