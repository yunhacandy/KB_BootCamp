package java_60_real_exam_set.src.student.todo.exception.p05;

class CalcTodo {
    // TODO 1: divide(int a, int b)를 작성하세요.
    // throws ArithmeticException
    public static void divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 2: divide 호출
        CalcTodo.divide(2,0);
    }
}
