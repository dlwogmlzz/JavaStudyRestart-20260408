package jumptojava.loop;

public class LoopMain1 {
    public static void main(String[] args) {
        int treeHit = 0;
        // 10번 찍어 안넘어가는 나무 없다.
        while (treeHit < 10) {
            treeHit++;
            System.out.println("나무를 " + treeHit + "번 찍었습니다.");

            // 나무를 10번 찍었을 경우 나무가 넘어간다.
            if (treeHit == 10) {
                System.out.println("앗!! 나무가 넘어갑니다.");
            }
        }
    }
}
