package student.todo.inheritance.p09;

abstract class MachineTodo {
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    // TODO 1: work() 추상 메소드 선언
}

class ComputerTodo extends MachineTodo {
    // TODO 2: work() 구현
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 3: ComputerTodo 실행
    }
}
