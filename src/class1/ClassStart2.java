package class1;

/**
 * 2명의 학생 정보를 출력하라
 * 학생1과 학생2의 이름 나이 성적을 출력!!
 * 출력한 후, 학생이 늘어났을때(3, 4, 5...) 변수를 추가하는 것이 아니라
 * 배열을 사용하는 것이 좋다. 출력문은 반복문(for)을 사용!!
 */

public class ClassStart2 {

    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrade = {90, 80};

        // 이것도 단점이 있음.. 정확한 데이터를 삭제하거나 수정해야 됌!!
        // 복수 학생의 정보를 하나로 묶는 것이 좋다.(클래스로!!!!)

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름:" + studentNames[i] + ", 나이:" + studentAges[i] + ", 성적:" + studentGrade[i]);
        }
    }
}
