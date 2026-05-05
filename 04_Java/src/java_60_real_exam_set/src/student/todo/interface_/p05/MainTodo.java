package java_60_real_exam_set.src.student.todo.interface_.p05;

interface PlayableTodo {
    // TODO 1: play 선언
    void play();
}

class MusicTodo implements PlayableTodo {
    // TODO 2: play 구현
    @Override
    public void play(){
        System.out.println("음악을 틉니다.");
    }
}

class MovieTodo implements PlayableTodo {
    // TODO 3: play 구현
    @Override
    public void play(){
        System.out.println("영화를 틉니다.");
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 4: 인터페이스 배열로 저장 후 반복
        PlayableTodo[] play = new PlayableTodo[2];

        // 객체 저장
        play[0] = new MusicTodo();
        play[1] = new MovieTodo();

        // 반복 실행
        for(PlayableTodo p : play){
            p.play();
        }
    }
}
