package jumptojava.oop;

class Sample {
    static int result = 0;

    static int add(int num) {
        result += num;
        return result;
    }
}

public class Calculator1 {
    public static void main(String[] args) {
        System.out.println(Sample.add(3));
        System.out.println(Sample.add(4));
        System.out.println(Sample.add(3));
    }
}
