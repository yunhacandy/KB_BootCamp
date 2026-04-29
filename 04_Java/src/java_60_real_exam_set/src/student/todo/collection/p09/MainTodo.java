package java_60_real_exam_set.src.student.todo.collection.p09;

import java.util.ArrayList;

class StudentTodo {
    String name;
    int score;

    // TODO 1: 생성자 작성
    public StudentTodo(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 2: StudentTodo 리스트 생성
        ArrayList<StudentTodo> list = new ArrayList<>();

        // TODO 3: 객체 3개 추가
        list.add(new StudentTodo("A", 80));
        list.add(new StudentTodo("B", 90));
        list.add(new StudentTodo("C", 70));

        // TODO 4: 평균 점수 출력
        int sum = 0;

        for (StudentTodo s : list) {
            sum += s.score;
        }

        double avg = (double) sum / list.size();

        System.out.println("평균 점수: " + avg);
    }
}
