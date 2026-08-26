package class1;

public class ClassStart3 {
    static void main() {
        // ClassStart2의 문제를 클래스로 해결해보자!
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("이름 : " + student1.name + " 나이 : " + student1.age + " 성적 : " + student1.grade);
        System.out.println("이름 : " + student2.name + " 나이 : " + student2.age + " 성적 : " + student2.grade);

        // 설계도가 클래스다.
        // 실재로 만들어진 클래스를 객체 또는 인스턴스라고 한다.
    }
}
