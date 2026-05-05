package java_60_real_exam_set.src.student.todo.inheritance.p04;

class TireTodo {
    // TODO 1: roll() 작성
    void roll(){
        System.out.println("일반 타이어가 굴러갑니다.");
    }
}

class SnowTireTodo extends TireTodo {
    // TODO 2: roll() 오버라이딩
    @Override
    public void roll() {
        System.out.println("스노우 타이어가 굴러갑니다.");
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 3: SnowTireTodo 객체를 TireTodo 변수에 대입 후 roll 호출
        TireTodo tireTodo = new SnowTireTodo();
        tireTodo.roll();
    }
}
