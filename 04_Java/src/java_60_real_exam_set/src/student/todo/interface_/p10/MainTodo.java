package java_60_real_exam_set.src.student.todo.interface_.p10;

interface PaymentServiceTodo {
    // TODO 1: pay(int amount) 선언
    // 결제 기능 "추상화", 구현 없음
    void pay(int amount);
}

class CardPaymentTodo implements PaymentServiceTodo {
    // TODO 2: pay 구현
    @Override
    public void pay(int amount) {
        System.out.println("카드로 " + amount + "원 결제");
    }
}

class KakaoPaymentTodo implements PaymentServiceTodo {
    // TODO 3: pay 구현
    @Override
    public void pay(int amount) {
        System.out.println("카카오페이로 " + amount + "원 결제");
    }
}

class OrderProcessorTodo {
    // TODO 4: process(PaymentServiceTodo service, int amount)
    void process(PaymentServiceTodo service, int amount) {
        service.pay(amount);
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 5: 카드/카카오페이 결제 처리
        OrderProcessorTodo order = new OrderProcessorTodo();

        //카드
        order.process(new CardPaymentTodo(), 10000);

        //카카오페이
        order.process(new KakaoPaymentTodo(), 20000);
    }
}
