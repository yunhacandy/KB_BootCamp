package java_60_real_exam_set.src.student.todo.oop.p05;

class CalculatorTodo {
    // TODO 1: static add(int x, int y) 작성
    static void add(int x, int y) {
        System.out.println(x + y);
    }

    // TODO 2: static sub(int x, int y) 작성
    static void sub(int x, int y) {
        System.out.println(x - y);
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 3: 객체 생성 없이 클래스명으로 메소드 호출
        CalculatorTodo.add(1, 2);
        CalculatorTodo.sub(1, 2);
    }
}
