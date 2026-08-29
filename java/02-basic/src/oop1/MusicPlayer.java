package oop1;

/*
음악 플레이어
속성: volume , isOn
기능: on() , off() , volumeUp() , volumeDown() , showStatus()
이것을 가지고 음악 플레이어를 만들어보자.
 */
public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;
    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }
    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }
    void volumeUp() {
        volume++;
        System.out.println("음악 플레이어 볼륨:" + volume);
    }
    void volumeDown() {
        volume--;
        System.out.println("음악 플레이어 볼륨:" + volume);
    }
    void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
