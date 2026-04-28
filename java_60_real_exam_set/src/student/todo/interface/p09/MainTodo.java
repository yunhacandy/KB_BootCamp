package student.todo.interface_.p09;

interface VehicleTodo {
    // TODO 1: run 선언
}

class AnonymousTodo {
    // TODO 2: field에 익명 구현 객체 대입

    void method1() {
        // TODO 3: localVar에 익명 구현 객체 대입 후 run 호출
    }

    void method2(VehicleTodo v) {
        v.run();
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 4: 필드, method1, method2(익명객체) 실행
    }
}
