package java_60_real_exam_set.src.student.todo.exception.p10;

public class MainTodo {
    public static void main(String[] args) {
        String[] data = {"10", "20", "a"};
        // TODO 1: 숫자로 바꿀 수 있는 값만 합산
        int sum = 0;
        for(String i : data){
            try{
                sum += Integer.parseInt(i);
            }
            catch(NumberFormatException e){
            }
        }
        // 결과 30 출력
        System.out.println(sum);
    }
}
