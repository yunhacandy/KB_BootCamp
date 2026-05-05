package java_60_real_exam_set.src.student.todo.oop.p01;

class StudentTodo {
    // TODO 1: name 필드 선언 (String)
    String name;
    // TODO 2: studentNo 필드 선언 (String)
    String studentNo;
    // TODO 3: grade 필드 선언 (int)
    int grade;

    // TODO 4: printInfo() 메소드 작성
    // 이름, 학번, 학년을 한 줄씩 출력
    void printInfo(){
        System.out.println(name);
        System.out.println(studentNo);
        System.out.println(grade);
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 5: StudentTodo 객체 2개 생성
        StudentTodo[] studentTodos = new StudentTodo[2];

        // 객체 생성
        studentTodos[0] = new StudentTodo();
        studentTodos[1] = new StudentTodo();

        // TODO 6: 서로 다른 학생 정보 저장
        studentTodos[0].name = "홍길동";
        studentTodos[0].studentNo = "202601";
        studentTodos[0].grade = 1;


        studentTodos[1].name = "박윤하";
        studentTodos[1].studentNo = "202602";
        studentTodos[1].grade = 4;

        // TODO 7: 각 객체의 printInfo() 호출
        for(StudentTodo student : studentTodos){
            student.printInfo();
        }
    }
}
