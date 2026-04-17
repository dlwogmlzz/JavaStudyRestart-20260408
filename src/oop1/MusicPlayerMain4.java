package oop1;

public class MusicPlayerMain4 {

    /* MusicPlayer 객체를 생성하고 필요한 기능(메서드)을 호출하기만 하면 된다.
    *  MusicPlayer를 보면 음악 플레이어를 구성하기 위한 속성과 기능이 마치 하나의 캡슐에 쌓여 있는것 같다.
    *  이렇게 속성과 기능을 하나로 묶어서 필요한 기능을 메서드를 통해 외부에 제공하는 것을 캡슐화라 한다.
    * */
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        //  음악 플레이어 켜기
        player.on();
        // 볼륨 증가
        player.volumeUp();
        // 볼륨 증가
        player.volumeUp();
        // 볼륨 감소
        player.volumeDown();
        // 음악 플레이어 상태
        player.showStatus();
        // 음악 플레이어 끄기
        player.off();
    }
}
