package final1;

public class ConstructInit {
    final int value;

    // final을 필드에 적용할 때
    // 값이 할당이 안되어있으면 생성자를 통해서 값을 넣어줘야 한다.
    public ConstructInit(int value) {
        this.value = value;
    }
}
