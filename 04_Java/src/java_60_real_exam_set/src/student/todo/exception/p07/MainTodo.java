package java_60_real_exam_set.src.student.todo.exception.p07;

public class MainTodo {
    static void checkAge(int age) throws Exception {
        // TODO 1: age < 18이면 new Exception("미성년자") 발생
        if (age < 18) {
            throw new Exception("미성년자");
        }
    }

    public static void main(String[] args) {
        // TODO 2: checkAge 호출 후 예외 처리
        try {
            checkAge(10);
        } catch (Exception e) {
            System.out.println("미성년자에요!!");
        }

    }
}
