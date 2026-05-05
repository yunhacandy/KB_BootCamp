package java_60_real_exam_set.src.student.todo.io.p06;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class MainTodo {
    public static void main(String[] args) throws Exception {
        // TODO 1: try-with-resources로 BufferedWriter 사용
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"))) {
            bw.write("Hello");
            bw.newLine();
            bw.write("Java");
        }
        System.out.println(new java.io.File("test.txt").getAbsolutePath());
    }
}
