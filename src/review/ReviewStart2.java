package review;

public class ReviewStart2 {

    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 17};
        int[] studentGrade = {90, 100};

        for (int i=0; i < studentNames.length; i++) {
            System.out.println("이름:" + studentNames[i] + ", 나이:" + studentAges[i] + ", 성적:" + studentGrade[i]);
        }
    }
}
