package java_60_real_exam_set.src.student.todo.inheritance.p03;

class AnimalTodo {
    // TODO 1: run() 작성
    public void run() {
        System.out.println("동물이 달립니다");
    }
}

class DogTodo extends AnimalTodo {
    // TODO 2: run() 오버라이딩
    @Override
    public void run() {
        System.out.println("강아지가 달립니다");
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 3: DogTodo 객체 생성 후 run 호출
        DogTodo dogTodo = new DogTodo();
        dogTodo.run();
    }
}
