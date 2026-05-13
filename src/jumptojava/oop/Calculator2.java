/*
*
* */
package jumptojava.oop;

class Sample1Add {
    static int result = 0;

    static int add(int num) {
        result += num;
        return result;
    }
}

class Sample2Add {
    static int result = 0;

    static int add(int num) {
        result += num;
        return result;
    }
}

public class Calculator2 {
    public static void main(String[] args) {
        System.out.println(Sample1Add.add(3));
        System.out.println(Sample1Add.add(7));

        System.out.println(Sample2Add.add(6));
        System.out.println(Sample2Add.add(5));
    }
}
