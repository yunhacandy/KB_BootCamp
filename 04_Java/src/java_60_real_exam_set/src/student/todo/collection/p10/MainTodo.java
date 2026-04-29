package java_60_real_exam_set.src.student.todo.collection.p10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: List<Map<String, Object>> 구조를 사용해 학생 2명 정보 저장
        // 이름, 점수 키 사용
        List<Map<String, Object>> students = new ArrayList<>();

        Map<String ,Object> s1 = new HashMap<>();
        s1.put("이름","홍길동");
        s1.put("점수", 90);

        Map<String ,Object> s2 = new HashMap<>();
        s2.put("이름","김진숙");
        s2.put("점수", 80);

        students.add(s1);
        students.add(s2);

        // TODO 2: 모든 학생 정보 출력
        for (Map<String, Object> student : students) {
            System.out.println(student.get("이름") + " : " + student.get("점수"));
        }
    }
}
