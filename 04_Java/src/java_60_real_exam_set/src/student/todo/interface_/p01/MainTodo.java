package java_60_real_exam_set.src.student.todo.interface_.p01;

interface RemoteControlTodo {
    // TODO 1: powerOn() 선언
    void powerOn();
}

class TVTodo implements RemoteControlTodo {
    // TODO 2: powerOn() 구현
    @Override
    public void powerOn(){
        System.out.println("TV 전원을 킵니다.");
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 3: 인터페이스 타입으로 TVTodo 객체 사용
        RemoteControlTodo rc = new TVTodo();
        rc.powerOn();
    }
}
