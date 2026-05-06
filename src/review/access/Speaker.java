package review.access;

public class Speaker {
    private int volume;

    // 생성자를 통해서 초기 음량을 지정함.
    Speaker(int volume) {
        this.volume = volume;
    }

    // 소리 높임.
    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    // 소리 낮춤.
    void volumeDown() {
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    // 현재 음량확인.
    void showVolume() {
        System.out.println("현재 음량은 " + volume + "입니다.");
    }
}
