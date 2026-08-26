package class1;

public class ClassStart1 {
    static void main() {
        String student1Name = "학생1";
        int student1Age = 15;
        int student1Grade = 90;

        String student2Name = "학생2";
        int student2Age = 16;
        int student2Grade = 80;

        System.out.println("이름 : " + student1Name + " 나이 : " + student1Age + " 성적 : " + student1Grade);
        System.out.println("이름 : " + student2Name + " 나이 : " + student2Age + " 성적 : " + student2Grade);

        // 위 코드의 문제점 : 학생이 늘어날 때마다 변수추가, 출력코드가 모두 필요하다.
    }
}
