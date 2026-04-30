package day11.test.todo;

import java.util.List;

public class Ex02_InternalIteratorTodo {
    public static void main(String[] args) {
        List<Integer> orderAmounts = List.of(12000, 35000, 8000, 64000, 17000);

        // TODO 1: stream()으로 주문 금액과 현재 스레드명을 출력하세요.
        orderAmounts.stream()
                .forEach(amount ->
                        System.out.println(amount + " : " + Thread.currentThread().getName())
                );

        System.out.println("----------------");

        // TODO 2: parallelStream()으로 주문 금액과 현재 스레드명을 출력하세요.

        orderAmounts.parallelStream()
                .forEach(amount ->
                        System.out.println(amount + " : " + Thread.currentThread().getName())
                );

        // TODO 3: 출력 순서가 항상 같지 않을 수 있는 이유를 주석으로 설명하세요.
        // 실행 순서가 보장되지 않는다.
    }
}

