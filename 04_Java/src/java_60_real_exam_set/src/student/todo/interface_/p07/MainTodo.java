package java_60_real_exam_set.src.student.todo.interface_.p07;

interface CalculableTodo {
    // TODO 1: static add(int x, int y) 작성
    static void add(int x, int y) {
        System.out.println(x + y);
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 2: 인터페이스명으로 add 호출
        CalculableTodo.add(10, 20);
    }
}
