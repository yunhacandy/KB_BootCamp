package java_60_real_exam_set.src.student.todo.io.p09;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// TODO 1: PersonTodo 클래스를 Serializable 구현으로 작성
class PersonTodo implements Serializable {
    String name;

    public PersonTodo(String name) {
        this.name = name;
    }
}

public class MainTodo {
    public static void main(String[] args) throws Exception {
        // TODO 2: 객체를 저장한 뒤 다시 읽어서 이름 출력

        PersonTodo person = new PersonTodo("홍길동");
        // 1. 객체 저장
        try (
                FileOutputStream fos = new FileOutputStream("person.dat");
                ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
            oos.writeObject(person);
        }
        // 2. 객체 읽기
        try (
                FileInputStream fis = new FileInputStream("person.dat");
                ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            PersonTodo readPerson = (PersonTodo) ois.readObject();

            System.out.println(readPerson.name);
        }
    }
}
