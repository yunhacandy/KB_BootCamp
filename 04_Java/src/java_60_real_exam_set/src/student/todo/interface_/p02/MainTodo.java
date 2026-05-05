package java_60_real_exam_set.src.student.todo.interface_.p02;

interface SoundableTodo {
    // TODO 1: sound() 선언
    void sound();
}

class CatTodo implements SoundableTodo {
    // TODO 2: sound() 구현
    @Override
    public void sound(){
        System.out.println("야옹");
    }
}

class DogTodo implements SoundableTodo {
    // TODO 3: sound() 구현
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}

public class MainTodo {
    static void printSound(SoundableTodo soundable) {
        // TODO 4: sound 결과 출력
        soundable.sound();
    }

    public static void main(String[] args) {
        // TODO 5: 고양이/강아지 출력
        printSound(new CatTodo());
        printSound(new DogTodo());
    }
}
