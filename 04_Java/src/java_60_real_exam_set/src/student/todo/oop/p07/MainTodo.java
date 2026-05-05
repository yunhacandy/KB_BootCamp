package java_60_real_exam_set.src.student.todo.oop.p07;

class AccountTodo {
    // TODO 1: private balance 필드
    private int balance;

    // TODO 2: MIN_BALANCE, MAX_BALANCE 상수 선언
    private static int MIN_BALANCE = 0;
    private static int MAX_BALANCE = 1000;

    // TODO 3: getBalance()
    int getBalance(){
        return balance;
    }

    // TODO 4: setBalance(int balance)
    // 범위 밖이면 기존 값 유지
    void setBalance(int balance){
        if(balance < MIN_BALANCE || balance > MAX_BALANCE){
            return;
        }
        this.balance = balance;
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 5: AccountTodo 객체 생성 후 set/get 테스트
        AccountTodo account = new AccountTodo();

        account.setBalance(100);
        System.out.println(account.getBalance());

        account.setBalance(-1);
        System.out.println(account.getBalance());

        account.setBalance(10000);
        System.out.println(account.getBalance());
    }
}
