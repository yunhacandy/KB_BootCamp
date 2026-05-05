package java_60_real_exam_set.src.student.todo.oop.p02;

class MemberTodo {
    String name;
    String id;

    // TODO 1: 생성자 작성
    // name, id를 받아 this로 초기화
    public MemberTodo(){
        this.name = name;
        this.id = id;
    }

    void printInfo() {
        System.out.println("이름: " + name);
        System.out.println("아이디: " + id);
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 2: 생성자를 이용해 객체 생성
        MemberTodo member = new MemberTodo();

        member.name = "박윤하";
        member.id = "1";

        // TODO 3: printInfo() 호출
        member.printInfo();
    }
}
