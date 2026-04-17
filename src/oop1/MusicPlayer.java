package oop1;

/* 자신의 멤버변수의 속성을 바꿈..
*
*  */
public class MusicPlayer {
    int volume;
    boolean isOn = false;

    // 전원 on/off 메서드 생성!
     void on () {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

     void off () {
        isOn = true;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    // 볼륨업 메서드 생성
     void volumeUp() {
        volume++;
        System.out.println("음악 플레이어 볼륨:" + volume);
    }

    // 볼륨다운 메서드 생성
     void volumeDown() {
        volume--;
        System.out.println("음악 플레이어 볼륨:" + volume);
    }

    // 음악 플레이어 상태 메서드 생성
     void showStatus() {
         System.out.println("음악 플레이어 상태 확인");
         if (isOn) {
             System.out.println("음악 플레이어 ON, 볼륨:" + volume);
         } else {
             System.out.println("음악 플레이어 OFF");
         }
     }
}
