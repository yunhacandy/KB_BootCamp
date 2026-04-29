package java_60_real_exam_set.src.student.todo.exception.p08;

import java.io.BufferedReader;
import java.io.StringReader;

public class MainTodo {
    public static void main(String[] args) throws Exception {
        // TODO 1: try-with-resources로 BufferedReader를 생성
        try (BufferedReader br = new BufferedReader(new StringReader("Hello World"))) {

            // TODO 2: 한 줄 읽어서 출력
            System.out.println(br.readLine());
        }
    }
}
