package java_60_real_exam_set.src.student.todo.exception.p09;

public class MainTodo {
    static int test() {
        try {
            return 1;
        } finally {
            // TODO 1: "finally 실행" 출력
            System.out.println("finally 실행");
        }
    }

    public static void main(String[] args) {
        // TODO 2: test 결과 출력
        System.out.println(test());
    }
}
