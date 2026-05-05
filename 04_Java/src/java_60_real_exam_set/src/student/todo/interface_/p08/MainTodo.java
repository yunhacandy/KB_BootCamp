package java_60_real_exam_set.src.student.todo.interface_.p08;

interface ActionTodo {
    // TODO 1: work 선언
    void work();
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 2: 익명 구현 객체 생성 후 work 호출
        new ActionTodo() {
            @Override
            public void work() {
                System.out.println("익명 객체 실행");
            }
        }.work();

        // ((ActionTodo) () -> System.out.println("익명 객체 실행")).work();
    }
}
