package oop1;

public class MusicPlayerMain3 {

  public static void main(String[] args) {
    MusicPlayerData data = new MusicPlayerData();

    on(data);
    System.out.println("음악 플레이어를 시작합니다.");

    volumeUp(data);
    System.out.println("음악 플레이어 볼륨: " + data.volume);

    volumeUp(data);
    System.out.println("음악 플레이어 볼륨: " + data.volume);

    volumeDown(data);
    System.out.println("음악 플레이어 볼륨: " + data.volume);

    System.out.println("음악 플레이어 상태 확인");
    showStatus(data);

    off(data);
    System.out.println("음악 플레이어를 종료합니다.");
  }

  static void off(MusicPlayerData data) {
    data.isOn = false;
  }

  static void showStatus(MusicPlayerData data) {
    if (data.isOn) {
      System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
    } else {
      System.out.println("음악 플레이어 OFF");
    }
  }

  static void volumeDown(MusicPlayerData data) {
    data.volume--;
  }

  static void volumeUp(MusicPlayerData data) {
    data.volume++;
  }

  static void on(MusicPlayerData data) {
    data.isOn = true;
  }
}
