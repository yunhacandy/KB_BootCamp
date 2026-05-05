package java_60_real_exam_set.src.student.todo.io.p03;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class MainTodo {
    public static void main(String[] args) throws Exception {
        // TODO 1
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // TODO 2: 두 줄 쓰기
        bw.write("첫 번째 줄");
        bw.newLine(); // 줄바꿈
        bw.write("두 번째 줄");

        // 출력 반영
        bw.flush();
        bw.close();
    }
}