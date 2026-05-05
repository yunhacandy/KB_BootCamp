package java_60_real_exam_set.src.student.todo.interface_.p09;

interface VehicleTodo {
    // TODO 1: run 선언
    // 인터페이스에서는 기본적으로 추상 메서드 (public abstract 생략 가능)
    void run();
}

class AnonymousTodo {
    // TODO 2: field에 익명 구현 객체 대입
    // 익명 구현 객체 = 이름 없는 클래스 + 인터페이스 구현
    // 반드시 인터페이스를 구현하거나 상속해야만 생성할 수 잇음
    VehicleTodo field = new VehicleTodo() {
        @Override
        public void run() {
            System.out.println("익명 객체 실행");
        }
    };

    void method1() {
        // TODO 3: localVar에 익명 구현 객체 대입 후 run 호출

        /*
        VehicleTodo localVar = new VehicleTodo() {
            @Override
            public void run() {
                System.out.println("로컬 익명 객체 실행");
            }
        };
         */

        //람다식도 가능
        VehicleTodo localVar = () -> System.out.println("로컬 익명 객체 실행");

        localVar.run();
    }

    void method2(VehicleTodo v) {
        // 매개변수로 받은 객체 실행
        v.run();
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 4: 필드, method1, method2(익명객체) 실행
        AnonymousTodo at = new AnonymousTodo();

        // 필드 실행
        at.field.run();

        // method1 실행
        at.method1();

        // method2에 익명 객체 전달
        at.method2(new VehicleTodo() {
            @Override
            public void run() {
                System.out.println("매개변수 익명 객체 실행");
            }
        });
    }
}
