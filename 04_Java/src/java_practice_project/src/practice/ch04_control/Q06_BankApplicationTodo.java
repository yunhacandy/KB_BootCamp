package practice.ch04_control;

import java.util.Scanner;

public class Q06_BankApplicationTodo {
    public static void main(String[] args) {

        // TODO 1: Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // TODO 2: 잔고(balance) 변수 선언 (초기값 0)
        int balance = 0;

        // TODO 3: while(true) 반복문 작성
        while (true) {

            // TODO 4: 메뉴 출력
            // ----------------------------------
            // 1.예금 | 2.출금 | 3.잔고 | 4.종료
            // ----------------------------------
            System.out.println("----------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("----------------------------------");

            // TODO 5: 사용자 선택 입력 받기 (nextLine 사용)
            String input = sc.nextLine();

            // TODO 6: if 또는 switch로 기능 구현

            // [1] 예금
            // - "예금액>" 출력
            // - 금액 입력 받아 balance에 더하기

            if (input.contains("예금") || input.contains("1")) {
                System.out.print("예금액>");
                int amount = sc.nextInt();
                balance += amount;
            }

            // [2] 출금
            // - "출금액>" 출력
            // - 금액 입력 받아 balance에서 빼기

            else if (input.contains("출금") || input.contains("2")) {
                System.out.print("출금액>");
                int amount = sc.nextInt();
                balance -= amount;
            }

            // [3] 잔고 조회
            // - "잔고>" + balance 출력
            else if (input.contains("잔고 조회") || input.contains("3")) {
                System.out.println("잔고>" + balance);
            }

            // [4] 종료
            // - "프로그램 종료" 출력
            // - break로 반복문 종료
            else {
                System.out.println("프로그램 종료");
                break;

            }
        }
        // TODO 7: Scanner 닫기
        sc.close();


    }
}
