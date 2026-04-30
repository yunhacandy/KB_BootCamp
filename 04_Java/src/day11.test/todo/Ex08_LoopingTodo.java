package day11.test.todo;

import day11.test.todo.common.Order;
import java.util.Arrays;
import java.util.List;

public class Ex08_LoopingTodo {
    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order(1, "홍길동", "DONE", 30000),
                new Order(2, "김수영", "READY", 12000),
                new Order(3, "오해영", "DONE", 45000)
        );

        // TODO 1: DONE 주문만 필터링하고 peek로 처리 로그를 출력한 뒤 금액 합계를 구하세요.
        orders.stream().filter(o -> o.getStatus().equals("DONE")).peek(System.out::println);

        int totalValue = orders.stream()
                .filter(o -> o.getStatus().equals("DONE"))
                .peek(n -> System.out.println("peek() 중간 결과물 확인" + n))
                .sum(); //todo: 수정

        System.out.println(totalValue);

        // TODO 2: forEach로 모든 주문의 고객명과 상태를 최종 출력하세요.

    }
}
