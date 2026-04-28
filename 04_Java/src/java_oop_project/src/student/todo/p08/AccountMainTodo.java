package java_oop_project.src.student.todo.p08;

public class AccountMainTodo {
    public static void main(String[] args) {
        AccountTodo account = new AccountTodo();

        // TODO 1: 10000 저장 후 현재 잔고를 출력하세요.
        account.setBalance(10000);
        System.out.println(account.getBalance());

        // TODO 2: -100 저장 시도 후 현재 잔고를 출력하세요.
        account.setBalance(-100);
        System.out.println(account.getBalance());

        // TODO 3: 2000000 저장 시도 후 현재 잔고를 출력하세요.
        account.setBalance(2000000);
        System.out.println(account.getBalance());

        // TODO 4: 300000 저장 후 현재 잔고를 출력하세요.
        account.setBalance(300000);
        System.out.println(account.getBalance());
    }
}
