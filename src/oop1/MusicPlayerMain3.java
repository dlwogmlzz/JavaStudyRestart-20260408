package oop1;

// 절차 지향 프로그래밍
public class MusicPlayerMain3 {

    public static void main(String[] args) {
        // 객체 생성
        MusicPlayerData data = new MusicPlayerData();
        data.isOn = true;

        /*
         * 메서드를 만듦으로서 각각의 기능이 모듈화 되었다.
         * 장점은 중복제거, 같은 로직이 필요하면 해당 메서드를 여러번 호출하면 된다.
         * 변경영향 범위, 기능을 수정할 때 해당 메서드 내부만 변경하면 된다.
         * 메서드 이름추가, 메서드 이름을 통해 코드를 더 쉽게 이해할수 있다.
         * ※모듈화: 레고블럭처럼 필요한 레고(메서드)를 꼽아서 사용할수 있다.
         *
         * 단점도 존재한다. 만약에 MusicPlayerData의 변수명이라던지 수정을 하려고 하면
         * 메서드의 코드들도 수정을 해야 한다!! 번거로움 발생!!
         * */
        //  음악 플레이어 켜기
        on(data);
        // 볼륨 증가
        volumeUp(data);
        // 볼륨 증가
        volumeUp(data);
        // 볼륨 감소
        volumeDown(data);
        // 음악 플레이어 상태
        showStatus(data);
        // 음악 플레이어 끄기
        off(data);
    }

    // 전원 on/off 메서드 생성!
    static void on (MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off (MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    // 볼륨업 메서드 생성
    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }

    // 볼륨다운 메서드 생성
    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }

    // 음악 플레이어 상태 메서드 생성
    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
