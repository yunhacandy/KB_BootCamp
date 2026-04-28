package java_oop_project.src.student.todo.p02;

public class MemberTodo {
    String name;
    String id;
    String password;
    int age;

    // TODO 1: name, id, password, age를 매개값으로 받는 생성자를 작성하세요.
    // TODO 2: 생성자 안에서 this를 사용해 필드를 초기화하세요.
    public MemberTodo(String name, String id, String password, int age) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.age = age;
    }

    // TODO 3: showProfile() 메소드를 작성하세요.
    // 출력 형식:
    // 이름: 홍길동
    // 아이디: hong
    // 비밀번호: 12345
    // 나이: 25
    public void showProfile() {
        System.out.println("이름 : "+ name);
        System.out.println("아이디 : " + id);
        System.out.println("비밀번호 : " + password);
        System.out.println("나이 : " + age);
    }

}
