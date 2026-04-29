package java_60_real_exam_set.src.student.todo.exception.p04;

public class MainTodo {
    public static void main(String[] args) {
        try {
            int x = 10 / 0;
        } catch (Exception e) {
            System.out.println("예외");
        } finally {
            // TODO 1: "무조건 실행" 출력
            System.out.println("무조건 실행");
        }
    }
}
