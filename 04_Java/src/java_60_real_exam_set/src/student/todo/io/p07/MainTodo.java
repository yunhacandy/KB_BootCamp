package java_60_real_exam_set.src.student.todo.io.p07;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainTodo {
    public static void main(String[] args) throws Exception {
        // TODO 1: input.bin 파일 내용을 copy.bin으로 복사
        try(FileInputStream fis = new FileInputStream("input.bin");
            FileOutputStream fos = new FileOutputStream("copy.bin")){
            int data;
            while ((data = fis.read()) != -1){
                fos.write(data);
            }
        }
    }
}
