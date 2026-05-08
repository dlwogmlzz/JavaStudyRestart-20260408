package jumptojava.switch1;

// 입력값이 정형화 되어 있는 경우 if문 보다는 switch/case문을 쓰는 것이 코드의 가독성이 좋다.
public class SwitchMain1 {
    public static void main(String[] args) {
        int month = 13;
        String monthString = "";

        /*
        * ※switch() 괄호안에 들어 갈수 있는 입력 변수
        * 정수형: byte, short, char, int
        * 열거형: enum
        * 문자열: String
        * */
        switch (month) {
            case 1:     monthString = "January";
                            break;
            case 2:     monthString = "February";
                            break;
            case 3:     monthString = "March";
                            break;
            case 4:     monthString = "April";
                            break;
            case 5:     monthString = "May";
                            break;
            case 6:     monthString = "June";
                            break;
            case 7:     monthString = "July";
                            break;
            case 8:     monthString = "August";
                            break;
            case 9:     monthString = "September";
                            break;
            case 10:   monthString = "October";
                            break;
            case 11:    monthString = "November";
                            break;
            case 12:   monthString = "December";
                            break;
            default:  monthString = "Invalid month";
                            break;
        }
        System.out.println(monthString);
    }
}
