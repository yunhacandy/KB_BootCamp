package java_60_real_exam_set.src.student.todo.inheritance.p06;

class ATodo {
    void method1() {
        System.out.println("A-method1()");
    }
}

class BTodo extends ATodo {
    @Override
    void method1() {
        System.out.println("B-method1()");
    }
}

class CTodo extends ATodo {
    @Override
    void method1() {
        System.out.println("C-method1()");
    }

    // TODO 1: method2() 작성
    void method2() {
        System.out.println("C-method2()");
    }
}

public class MainTodo {
    static void action(ATodo a) {
        a.method1();

        // TODO 2: a가 CTodo이면 method2 호출
        if (a instanceof CTodo) { //객체가 특정 클래스 타입이 맞는지 검토
            ((CTodo) a).method2();
        }
    }

    public static void main(String[] args) {
        // TODO 3: action 세 번 호출
        action(new ATodo());
        action(new BTodo());
        action(new CTodo());
    }
}
