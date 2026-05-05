package java_60_real_exam_set.src.student.todo.io.p08;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.Serializable;

// TODO 1: PersonTodo 클래스를 Serializable 구현으로 작성
// name 필드와 생성자 포함
class PersonTodo implements Serializable {
    //Serializable은 객체를 파일에 저장하거나, 네트워크로 보낼 수 있는 형태로 바꿀 수 있다는 표시
    //여기서는 PersonTodo 객체를 통째로 저장해도 된다는 표시를 붙인 것
    String name;

    public PersonTodo(String name) {
        this.name = name;
    }
}

public class MainTodo {
    public static void main(String[] args) throws Exception {
        // TODO 2: PersonTodo 객체를 person.dat에 저장
        PersonTodo person = new PersonTodo("HongGilDong");  //원래는 객체가 메모리 안에만 있음
        //이것을 파일로 저장하려면 Java 객체를 바이트 형태로 바꿔야 함
        //Java가 저장하는 객체인지 확인할때 기준이 되어주는게 Serializable

        try (
                FileOutputStream fos = new FileOutputStream("person.dat");
                ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
            oos.writeObject(person);
        }
    }
}
