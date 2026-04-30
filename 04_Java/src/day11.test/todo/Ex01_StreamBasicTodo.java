package day11.test.todo;

import java.util.List;

public class Ex01_StreamBasicTodo {
    public static void main(String[] args) {
        List<String> orderStatuses = List.of("READY", "PAID", "SHIPPING", "DONE");

        // TODO 1: orderStatuses에서 스트림을 얻으세요.
        var stream = orderStatuses.stream();

        // TODO 2: forEach를 사용해 각 주문 상태를 "상태: READY" 형식으로 출력하세요.
        stream.forEach(status -> System.out.println("상태: " + status));
    }
}
