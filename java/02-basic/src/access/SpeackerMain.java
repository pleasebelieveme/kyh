package access;

public class SpeackerMain {
    static void main(String[] args) {
        Speacker speacker = new Speacker(90);
        speacker.showVolume();
        speacker.volumeUp();
        speacker.showVolume();
        speacker.volumeUp();
        speacker.showVolume();

        // 필드에 직접 접근
        System.out.println("----------volume필드에 직접 접근하여 수정-----------");
//        speacker.volume = 200;
        speacker.showVolume();
    }
}
