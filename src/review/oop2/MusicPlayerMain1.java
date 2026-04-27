package review.oop2;

// 절차지향 프로그래밍(지역변수 선언)
public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        // 음악 플레이어 켜기
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        // 볼륨 증가
        volume++;
        System.out.println("음약 플레이어 볼륨:" + volume);
        // 볼륨 증가
        volume++;
        System.out.println("음약 플레이어 볼륨:" + volume);
        // 볼륨 감소
        volume--;
        System.out.println("음약 플레이어 볼륨:" + volume);

        // 음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        // 켜져있으면
        if (isOn) {
            System.out.println("음악 플레이어 On, 현재 볼륨:" + volume);
            // 켜져있지 않으면
        } else {
            System.out.println("음악 플레이어 Off");
        }
        // 음악 플레이어 끄기
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
