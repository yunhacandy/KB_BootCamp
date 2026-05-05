package java_60_real_exam_set.src.student.todo.inheritance.p01;

class ParentTodo {
    // TODO 1: name 필드 선언
    String name = "박윤하";
}

class ChildTodo extends ParentTodo {
    // TODO 2: age 필드 선언
    int age = 26;
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 3: ChildTodo 객체를 생성하고 부모/자식 필드 출력
        ChildTodo childTodo = new ChildTodo();

        String name = childTodo.name;
        int age = childTodo.age;

        System.out.println(name + age);
    }
}
