package java_60_real_exam_set.src.student.todo.io.p01;

import java.io.File;

public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: File 객체를 생성하고 경로를 출력하세요.
        File file = new File("text.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
    }
}
