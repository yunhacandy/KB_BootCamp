package day11.test.todo;

import day11.test.todo.common.Order;
import java.util.List;

public class Ex08_LoopingTodo {
    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order(1, "홍길동", "DONE", 30000),
                new Order(2, "김수영", "READY", 12000),
                new Order(3, "오해영", "DONE", 45000)
        );

        // TODO 1: DONE 주문만 필터링하고 peek로 처리 로그를 출력한 뒤 금액 합계를 구하세요.
        int totalValue = orders.stream()
                .filter(o -> o.getStatus().equals("DONE"))
                .peek(o -> System.out.println("처리 중: " + o))
                .mapToInt(Order::getAmount)
                .sum();

        System.out.println(totalValue);

        System.out.println("----------------");

        // TODO 2: forEach로 모든 주문의 고객명과 상태를 최종 출력하세요.
        orders.stream()
                .forEach(o -> System.out.println(o.getCustomer() + " : " + o.getStatus()));
    }
}
