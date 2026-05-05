package java_60_real_exam_set.src.student.todo.interface_.p04;

interface ATodo {
    // TODO 1: method1 선언
    void method1();
}

class BTodo implements ATodo {
    // TODO 2: method1 구현
    @Override
    public void method1(){
        System.out.println("BTodo method1");
    }
}

class CTodo implements ATodo {
    // TODO 3: method1 구현
    @Override
    public void method1(){
        System.out.println("CTodo method1");
    }

    // TODO 4: method2 작성
    public void method2(){
        System.out.println("CTodo method2");
    }
}

public class MainTodo {
    static void action(ATodo a) {
        // TODO 5: method1 호출, CTodo면 method2 호출
        a.method1();
        if (a instanceof CTodo) { //객체가 특정 클래스 타입이 맞는지 검토
            ((CTodo) a).method2();
        }
    }

    public static void main(String[] args) {
        // TODO 6: action 호출
        // action(new ATodo());가 안되는 이유 - 상속 6번 문제랑 차이
        // 인터페이스 타입은 직접 생성이 안된다. 굳이 하고 싶으면 익명 객체 사용
        action(new BTodo());
        action(new CTodo());
    }
}
