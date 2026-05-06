package review.oop2;
// 캡슐화 - 속성과 기능을 하나로 묶어서 필요한 기능을 메서드를 톻해 외부에 제공하는 것.
// 자기자신을 바꾼다는 느낌.
// 음악플레이어에 필요한 모든 속성과 기능을 하나의 클래스에 포함시킴..
public class MusicPlayer {
    // 1. 속성(변수)을 만듦
    int volume = 0;
    boolean isOn = false;

    // 2. 기능(메서드)을 만듦
    // 음악 플레이어 켜기
    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    // 음악 플레이어 끄기
     void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

     void volumeUp() {
        volume++;
        System.out.println("음약 플레이어 볼륨:" + volume);
    }

     void volumeDown() {
        volume--;
        System.out.println("음약 플레이어 볼륨:" + volume);
    }

     void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 On, 현재 볼륨:" + volume);
            // 켜져있지 않으면
        } else {
            System.out.println("음악 플레이어 Off");
        }
    }
}
