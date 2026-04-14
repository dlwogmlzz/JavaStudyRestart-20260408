package Review;

public class ReviewStart2 {

    public static void main(String[] args) {
        // 학생 한명을 더 추가하기 위해서는 또 추가하고 번거롭다...
        // 그래서 배열을 이용한다.
        // 이것도 매번 배열에 학생을 추가 해줘야 하고, 변경시에 인덱스 위치를 틀리면 에러가 뜬다.
        String[] studentNames = {"학생1", "학생2", "학생3"};
        int[] studentAges = {10, 12, 14};
        int[] studentGrades = {100, 80, 75};

        // for문으로 출력
        // 학생수가 늘어 남에 따라 for문으로 늘리기
        for (int i = 0; i < studentNames.length; i++){
            System.out.println("이름: " + studentNames[i] + ", 나이: " + studentAges[i] + ", 성적: " + studentGrades[i]);
        }
    }
}
