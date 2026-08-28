package ref;

public class NullMain2 {
    static void main(String[] args) {
        Data data = null;
        data.value = 10; // NullPointException 발생 -> null.value
        System.out.println("data = " + data.value);
    }
}
