package student.todo.interface_.p10;

interface PaymentServiceTodo {
    // TODO 1: pay(int amount) 선언
}

class CardPaymentTodo implements PaymentServiceTodo {
    // TODO 2: pay 구현
}

class KakaoPaymentTodo implements PaymentServiceTodo {
    // TODO 3: pay 구현
}

class OrderProcessorTodo {
    // TODO 4: process(PaymentServiceTodo service, int amount)
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 5: 카드/카카오페이 결제 처리
    }
}
