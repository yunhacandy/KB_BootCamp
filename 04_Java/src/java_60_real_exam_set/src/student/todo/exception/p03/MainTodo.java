package java_60_real_exam_set.src.student.todo.exception.p03;

public class MainTodo {
    public static void main(String[] args) {
        String s = null;
        // TODO 1: NullPointerException 또는 NumberFormatException을 한 번에 처리
        try {
            Integer.parseInt(s);
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("예외 발생");
        }
    }
}
