package ref;

public class NullMain1 {

    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data); // null
        // 2. 가비지컬렉션(GC)로 인해 자동으로 제거해줌. 접근못함.
        /**
         * C언어 일때는 필요없는 코드를 제거하는 코드를 만들어서 일일이 제거를 해줘야만 했다.
         * 하지만 GC,가비지컬렉션으로 인해서 필요없는 코드를 자동으로 제거를 해주기때문에,
         * 편해졌음..
         */
        data = new Data();
        System.out.println("2. data = " + data); // 참조값이 들어감.

        // 1 .다시 null로 해주면
        data = null;
        System.out.println("3. data = " + data);

    }
}
