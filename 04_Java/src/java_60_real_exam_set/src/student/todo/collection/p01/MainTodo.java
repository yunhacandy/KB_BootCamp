package java_60_real_exam_set.src.student.todo.collection.p01;

import java.util.ArrayList;
import java.util.List;

public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: List<String> 생성
        List<String> list = new ArrayList<>();

        // TODO 2: "Java", "Spring", "Vue" 추가
        list.add("Java");
        list.add("Spring");
        list.add("Vue");

        // TODO 3: 전체 요소 출력
        for (String item : list) {
            System.out.println(item);
        }
    }
}
