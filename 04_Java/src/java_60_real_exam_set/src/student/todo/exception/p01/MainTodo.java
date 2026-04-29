package java_60_real_exam_set.src.student.todo.exception.p01;

public class MainTodo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        // TODO 1: arr[3] 접근 시 예외를 처리하세요.
        // 예외 발생 시 "예외 발생" 출력

        try {
            System.out.println(arr[3]);  // 예외 발생
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("예외 발생");
        }
    }
}
