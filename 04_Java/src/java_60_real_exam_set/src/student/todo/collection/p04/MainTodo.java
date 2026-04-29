package java_60_real_exam_set.src.student.todo.collection.p04;

import java.util.HashMap;
import java.util.Map;

public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: Map<String, Integer> 생성
        Map<String, Integer> map = new HashMap<>();
        // TODO 2: 국어 90, 영어 80, 수학 95 저장
        map.put("국어", 90);
        map.put("영어", 80);
        map.put("수학", 95);

        // TODO 3: 영어 점수 출력
        System.out.println("영어 점수: " + map.get("영어"));
    }
}
