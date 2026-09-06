package extends1.super2;

public class ClassB extends ClassA {
    public ClassB(int a) {
        super(); //기본 생성자 생략 가능, 매개변수가 없는 경우에 가능
        System.out.println("ClassB 생성자 a="+a);
    }
    public ClassB(int a, int b) {
        super(); //기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a="+a + " b=" + b);
    }
}
