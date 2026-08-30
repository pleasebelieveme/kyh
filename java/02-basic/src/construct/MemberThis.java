package construct;

public class MemberThis {
    String nameField;

    // 이름이 다르면 this가 없어도 접근이 가능하다.
    void initMember(String nameParameter) {
        nameField = nameParameter;
    }
}
