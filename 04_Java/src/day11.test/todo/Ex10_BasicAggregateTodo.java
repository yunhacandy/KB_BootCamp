package day11.test.todo;

import day11.test.todo.common.Order;
import java.util.List;

public class Ex10_BasicAggregateTodo {
    public static void main(String[] args) {
        List<Order> orders = List.of(new Order(1, "홍길동", "DONE", 30000), new Order(2, "김수영", "READY", 12000),
                new Order(3, "오해영", "DONE", 45000), new Order(4, "강감찬", "DONE", 22000));
        // TODO: DONE 주문 기준 count, sum, average, max, min을 구하세요.
        // TODO: READY 주문 중 첫 번째 주문 금액을 findFirst로 구하세요. 없으면 -1을 출력하세요.
    }
}
