package java_60_real_exam_set.src.student.todo.io.p02;

import java.io.FileWriter;

public class MainTodo {
    public static void main(String[] args) throws Exception {
        // TODO 1: FileWriter로 test.txt에 "Java" 쓰기
        FileWriter writer = new FileWriter("test.txt");
        writer.write("Java");

        // TODO 2: close 호출
        writer.close();
    }
}
