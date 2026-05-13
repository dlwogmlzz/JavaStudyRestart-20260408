package jumptojava.oop;

class Sample3Add {
    int result = 0;

    int add(int num) {
        result += num;
        return result;
    }
}

class Sample4Sub {
    int result = 0;

    int sub(int num) {
        result -= num;
        return result;
    }
}


public class Calculator3 {
    public static void main(String[] args) {
        Sample1Add sam1 = new Sample1Add();       // 계산기 1객체를 생성한다.
        Sample2Add sam2 = new Sample2Add();       // 계산기 2객체를 생성한다.

        System.out.println(sam1.add(4));
        System.out.println(sam1.add(8));

        System.out.println(sam2.add(10));
        System.out.println(sam2.add(5));
    }
}
