package final1;

public class FieldInit {
    // static final = 상수, 대문자가 관례
    static final int CONST_VALUE = 10;
    final int value = 10;

    // 필드에 값이 할당되어 있으면 컴파일에러
//    public FieldInit(int value) {
//        this.value = value;
//    }
}
