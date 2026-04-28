package student.todo.p10;

import java.util.Scanner;

public class BankApplicationTodo {
    static AccountTodo[] accountArray = new AccountTodo[100];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            System.out.println("------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("------------------------------------------------");
            System.out.print("선택> ");
            String selectNo = scanner.nextLine();

            switch (selectNo) {
                case "1":
                    createAccount();
                    break;
                case "2":
                    accountList();
                    break;
                case "3":
                    deposit();
                    break;
                case "4":
                    withdraw();
                    break;
                case "5":
                    run = false;
                    System.out.println("프로그램 종료");
                    break;
            }
        }
    }

    static void createAccount() {
        // TODO 1: "계좌생성" 안내를 출력하세요.
        // TODO 2: 계좌번호, 계좌주, 초기입금액을 nextLine()으로 입력받으세요.
        // TODO 3: 새 AccountTodo 객체를 생성하세요.
        // TODO 4: accountArray에서 null인 첫 위치를 찾아 저장하세요.
        // TODO 5: "결과: 계좌가 생성되었습니다."를 출력하세요.
    }

    static void accountList() {
        // TODO 6: 저장된 모든 계좌를 출력하세요.
        // 출력 형식:
        // 111-111    홍길동    10000
    }

    static void deposit() {
        // TODO 7: 계좌번호와 예금액을 입력받으세요.
        // TODO 8: findAccount(계좌번호)로 계좌를 찾으세요.
        // TODO 9: 계좌가 있으면 balance에 예금액을 더하고 성공 메시지를 출력하세요.
    }

    static void withdraw() {
        // TODO 10: 계좌번호와 출금액을 입력받으세요.
        // TODO 11: findAccount(계좌번호)로 계좌를 찾으세요.
        // TODO 12: 계좌가 있으면 balance에서 출금액을 빼고 성공 메시지를 출력하세요.
    }

    static AccountTodo findAccount(String ano) {
        // TODO 13: 배열을 순회하면서 ano가 같은 계좌를 찾으세요.
        // TODO 14: 찾으면 해당 AccountTodo를 반환하세요.
        // TODO 15: 끝까지 없으면 null을 반환하세요.
        return null;
    }
}
