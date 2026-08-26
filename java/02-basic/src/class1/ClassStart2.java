package class1;

public class ClassStart2 {
    static void main() {
        // 배열로 해결해보자!
        String[] studentNames = {"학생1", "학생2", "학생3"};
        int[] studentAges = {16, 15, 17};
        int[] studentGrades = {90, 80, 70};

        for (int i=0; i<studentNames.length; i++) {
            System.out.println("이름 : " + studentNames[i] + " 나이 : " + studentAges[i] + " 성적 : " + studentGrades[i]);
        }

        // 학생의 데이터가 서로 다른 곳에 위치해서 휴면에러의 가능성이 크다.
    }
}
