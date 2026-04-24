package review.ref2;

import java.sql.SQLOutput;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA; // 참조값을 같게 했기 때문에 같이 변경된다?

        System.out.println("dataA 참조값=" + dataA);           // 같은 주소
        System.out.println("dataB 참조값=" + dataB);             // 같은 주소
        System.out.println("dataA.value = " + dataA.value);  // 10
        System.out.println("dataB.value = " + dataB.value);    // 10

        // dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value);     // 20
        System.out.println("dataB.value = " + dataB.value);      // 20

        // dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value);     // 20X 30O
        System.out.println("dataB.value = " + dataB.value);      // 30
    }
}

