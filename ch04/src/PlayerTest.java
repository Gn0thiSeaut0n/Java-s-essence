public class PlayerTest {
    public static void main(String[] args) {
        Player ap = new AudioPlayer();
        ap.play(100);
        ap.stop();
    }
}

abstract class Player { // 추상 클래스
    abstract void play(int post); // 추상 메서드

    abstract void stop(); // 추상 메서드
}

class AudioPlayer extends Player {
    void play(int pos) {
        System.out.println(pos + "위치부터 play 합니다.");
    }

    void stop() {
        System.out.println("재생을 멈춥니다.");
    }
}