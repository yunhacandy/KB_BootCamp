package java_60_real_exam_set.src.student.todo.io.p05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class MainTodo {
    public static void main(String[] args) throws Exception {
        // TODO 1: BufferedReader로 첫 줄 읽고 출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(str);
    }
}
