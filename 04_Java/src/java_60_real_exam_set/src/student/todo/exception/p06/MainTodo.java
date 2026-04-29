package java_60_real_exam_set.src.student.todo.exception.p06;

// TODO 1: Exception을 상속한 LoginExceptionTodo 작성
class LoginExceptionTodo extends Exception {
    public LoginExceptionTodo(String message) {
        super(message);
    }
}

public class MainTodo {
    // TODO 2: login(String id) 메소드 작성
    // id가 "admin"이 아니면 LoginExceptionTodo 발생
    public static void login(String id) throws LoginExceptionTodo {
        if (!id.equals("admin")) {
            throw new LoginExceptionTodo("로그인 실패: admin만 접근 가능");
        }
    }

    public static void main(String[] args) {
        // TODO 3: 예외 메시지 출력
        try {
            login("user");  // 일부러 실패
        } catch (LoginExceptionTodo e) {
            System.out.println(e.getMessage());
        }
    }
}
