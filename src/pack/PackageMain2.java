package pack;

//import pack.a.User;
//import pack.a.User2;
import pack.a.*;

public class PackageMain2 {

    public static void main(String[] args) {
        //자기와 같은 패키지면 객체 생성하고 바로 쓰면 됌...
        Data data = new Data();
        //다른 패키지일경우인데.... 너무 불편함...
        User user = new User();
        User2 user2 = new User2();
    }
}
