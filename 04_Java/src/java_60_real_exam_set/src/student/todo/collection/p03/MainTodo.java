package java_60_real_exam_set.src.student.todo.collection.p03;

import java.util.HashSet;
import java.util.Set;

public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: Set<Integer> 생성
        Set<Integer> set = new HashSet<>();

        // TODO 2: 10, 20, 10, 30 추가
        set.add(10);
        set.add(20);
        set.add(10);
        set.add(30);

        // TODO 3: 크기와 요소 출력
        System.out.println("크기: "+ set.size());

        System.out.print("요소: ");
        for(int num : set){
            System.out.print(num + " ");
        }

        /*
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            int result = (Integer) iterator.next();
            System.out.println(result);
        }
         */
    }
}
