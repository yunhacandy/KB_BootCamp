package java_60_real_exam_set.src.student.todo.oop.p10;

class AccountTodo {
    String ano;
    String owner;
    int balance;

    // TODO 1: 생성자 (계좌 정보 초기화)
    AccountTodo(String ano, String owner, int balance){
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }
}

public class MainTodo {
    static AccountTodo[] accountArray = new AccountTodo[100];

    // TODO 2: 계좌 생성
    static void createAccount(String ano, String owner, int balance){
        for(int i = 0; i < accountArray.length; i++){
            if(accountArray[i] == null){
                accountArray[i] = new AccountTodo(ano, owner, balance);
                break;
            }
        }
    }

    // TODO 3: 계좌 찾기
    static AccountTodo findAccount(String ano){
        for(AccountTodo acc : accountArray){
            if(acc != null && acc.ano.equals(ano)){
                return acc;
            }
        }
        return null;
    }

    // TODO 4: 입금
    static void deposit(String ano, int money){
        AccountTodo acc = findAccount(ano);
        if(acc != null){
            acc.balance += money;
        }
    }

    // TODO 5: 출금
    static void withdraw(String ano, int money){
        AccountTodo acc = findAccount(ano);
        if(acc != null){
            acc.balance -= money;
        }
    }

    public static void main(String[] args) {
        // TODO 6

        // 계좌 생성
        createAccount("111-111", "홍길동", 10000);

        // 입금
        deposit("111-111", 5000);

        // 출금
        withdraw("111-111", 3000);

        // 결과 출력
        AccountTodo acc = findAccount("111-111");
        if(acc != null){
            System.out.println("계좌번호: " + acc.ano);
            System.out.println("예금주: " + acc.owner);
            System.out.println("잔액: " + acc.balance);
        }
    }
}