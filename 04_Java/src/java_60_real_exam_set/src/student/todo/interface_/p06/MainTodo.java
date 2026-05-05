package java_60_real_exam_set.src.student.todo.interface_.p06;

interface RemoteControlTodo {
    // TODO 1: turnOn 선언
    // 원래 인터페이스는 메서드 선언만 가능하고 구현은 안가짐
    void turnOn();

    // TODO 2: default setMute(boolean mute) 작성
    // default란, 인터페이스 안에서 구현까지 가진 매소드
    // 기존 인터페이스를 깨지 않기 위해
    // 기본 구현 제공
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리합니다.");
        } else {
            System.out.println("무음 해제합니다.");
        }
    }
}

class TelevisionTodo implements RemoteControlTodo {
    // TODO 3: turnOn 구현
    @Override
    public void turnOn(){
        System.out.println("TV를 킵니다.");
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 4: turnOn, setMute 호출
        RemoteControlTodo rc = new TelevisionTodo();

        rc.turnOn();
        rc.setMute(true);
        rc.setMute(false);
    }
}
