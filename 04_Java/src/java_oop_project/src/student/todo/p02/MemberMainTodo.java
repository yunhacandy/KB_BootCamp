package java_oop_project.src.student.todo.p02;

public class MemberMainTodo {
    public static void main(String[] args) {
        // TODO 1: 생성자를 이용해서 MemberTodo 객체를 생성하세요.
        // name = "홍길동", id = "hong", password = "12345", age = 25
        MemberTodo memberTodo = new MemberTodo("홍길동", "hong", "12345", 25);
        // TODO 2: showProfile() 메소드를 호출하세요.
        memberTodo.showProfile();
    }
}
