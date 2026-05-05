package java_60_real_exam_set.src.student.todo.inheritance.p09;

abstract class MachineTodo {
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    // TODO 1: work() 추상 메소드 선언
    abstract void work();

}

class ComputerTodo extends MachineTodo {
    // TODO 2: work() 구현
    @Override   //오버라이딩 맞는지 컴파일러가 대신 검사해주는 안전장치 (부모에 없는 메서드 → 컴파일 에러)
    void work() {
        System.out.println("일을 시작합니다.");
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 3: ComputerTodo 실행
        ComputerTodo computer = new ComputerTodo();
        computer.powerOn();
        computer.work();
        computer.powerOff();
    }
}
