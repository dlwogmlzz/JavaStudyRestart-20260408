package pack;

//import pack.a.User;

public class PackageMain1 {

    public static void main(String[] args) {
        //자기와 같은 패키지면 객체 생성하고 바로 쓰면 됌...
        Data data = new Data();
        //다른 패키지일경우..
        pack.a.User user = new pack.a.User();
    }
}
