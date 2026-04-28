package java_oop_project.src.student.todo.p03;

public class MemberServiceMainTodo {
    public static void main(String[] args) {
        MemberServiceTodo memberService = new MemberServiceTodo();

        // TODO 1: login("hong", "12345")를 호출하고 결과를 저장하세요.
        boolean answer = memberService.login("hong", "12345");
        // TODO 2: 결과가 true이면
        // "로그인 되었습니다."를 출력하고 logout("hong")를 호출하세요.
        if(answer == true){
            System.out.println("로그인 되었습니다.");
            memberService.logout("hong");
        }
        // TODO 3: 결과가 false이면
        // "id 또는 password가 올바르지 않습니다."를 출력하세요.
        else {
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }
    }
}
