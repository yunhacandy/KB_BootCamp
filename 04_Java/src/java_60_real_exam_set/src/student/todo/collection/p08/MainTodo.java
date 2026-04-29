package java_60_real_exam_set.src.student.todo.collection.p08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: 정수 리스트 생성 후 30, 10, 20 추가
        ArrayList<Integer> list = new ArrayList<>();

        list.add(30);
        list.add(10);
        list.add(20);

        // TODO 2: 오름차순 정렬 후 출력
        Collections.sort(list);
        for(int num : list){
            System.out.print(num + " ");
        }

//        Integer[] array = list.toArray(new Integer[0]);
//        // 길이가 0인 배열을 하나 만들어서 전달
//        // 실제로는 내부에서 적절한 크기로 새 배열 만들어서 반환
//
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
    }
}
