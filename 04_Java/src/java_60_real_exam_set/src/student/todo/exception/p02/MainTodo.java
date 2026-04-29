package java_60_real_exam_set.src.student.todo.exception.p02;

public class MainTodo {
    public static void main(String[] args) {
        String s = "abc";
        // TODO 1: Integer.parseInt(s) 예외 처리

        try{
            Integer.parseInt(s);
        } catch(NumberFormatException e){
            System.out.println("예외발생");
        }
    }
}
