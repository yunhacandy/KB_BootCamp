package java_60_real_exam_set.src.student.todo.oop.p08;

class StudentTodo {
    String name;
    int score;

    // TODO 1: 생성자 작성
    // 생성자는 객체의 초기 상태를 설정하는 특별한 메소드
    // 기본 생성자는 따로 정의하지 않아도 자동으로 제공
    StudentTodo(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 2: StudentTodo 배열 생성
        StudentTodo[] studentTodos = new StudentTodo[3];

        // TODO 3: 객체 3개 저장
        studentTodos[0] = new StudentTodo("홍", 100);
        studentTodos[1] = new StudentTodo("길", 200);
        studentTodos[2] = new StudentTodo("동", 300);

        // TODO 4: 합계와 평균 출력
        int sum = 0;

        for(StudentTodo s : studentTodos){
            sum += s.score;
        }

        double avg = (double)sum / studentTodos.length;

        System.out.println("합계: " + sum);
        System.out.println("평균: " + avg);
    }
}
