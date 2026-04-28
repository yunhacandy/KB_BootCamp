package student.todo.exception.p04;

public class MainTodo {
    public static void main(String[] args) {
        try {
            int x = 10 / 0;
        } catch (Exception e) {
            System.out.println("예외");
        } finally {
            // TODO 1: "무조건 실행" 출력
        }
    }
}
