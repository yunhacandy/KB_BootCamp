package java_oop_project.src.student.todo.p03;

public class MemberServiceTodo {

    // TODO 1: login(String id, String password) 메소드를 작성하세요.
    // 조건:
    // id가 "hong" 이고 password가 "12345"이면 true 반환
    // 그 외에는 false 반환
    public boolean login(String id, String password){
        if(id.equals("hong") && password.equals("12345")){
            return true;
        }
        else{
            return false;
        }
    }

    // TODO 2: logout(String id) 메소드를 작성하세요.
    // 출력 형식:
    // hong님이 로그아웃 되었습니다.
    public void logout(String id){
        System.out.println(id + "님이 로그아웃 되었습니다.");
    }
}
