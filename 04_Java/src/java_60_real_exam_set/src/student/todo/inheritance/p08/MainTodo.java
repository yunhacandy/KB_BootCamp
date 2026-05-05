package java_60_real_exam_set.src.student.todo.inheritance.p08;

class BaseTodo {
    // TODO 1: final showInfo() 작성
    final void showInfo(){
        System.out.println("기본 정보");
    }
}

class SubTodo extends BaseTodo {
    // TODO 2: extra() 작성
    void extra(){
        System.out.println("추가 기능");
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 3: showInfo와 extra 호출
        SubTodo sub = new SubTodo();
        sub.showInfo();
        sub.extra();
    }
}
