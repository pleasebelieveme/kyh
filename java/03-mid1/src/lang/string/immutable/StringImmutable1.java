package lang.string.immutable;

public class StringImmutable1 {
    public static void main(String[] args) {
        String str = "hello";
        str.concat(" java");
        System.out.println("str = " + str);
        // 반환값을 안받으면 문자열이 합쳐진 내용을 받을 수 없다.
    }
}
