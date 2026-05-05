package java_60_real_exam_set.src.student.todo.io.p04;

import java.io.FileReader;
import java.io.FileWriter;

public class MainTodo {
    public static void main(String[] args) throws Exception {
        //text.txt 만들기
        FileWriter fw = new FileWriter("test.txt");
        fw.write("Hello");
        fw.close();

        // TODO 1: FileReader로 한 글자씩 읽기
        FileReader fr = new FileReader("test.txt");

        int data;
        while((data = fr.read()) != -1){
            System.out.print((char)data + " ");
        }

        fr.close();
    }
}
