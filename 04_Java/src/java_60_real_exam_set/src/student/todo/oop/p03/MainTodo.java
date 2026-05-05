package java_60_real_exam_set.src.student.todo.oop.p03;

class RectangleTodo {
    int width;
    int height;

    RectangleTodo(int width, int height) {
        // TODO 1: 필드 초기화
        this.width = width;
        this.height = height;
    }

    // TODO 2: getArea() 작성
    void getArea() {
        System.out.println(width * height);
    }

    // TODO 3: getPerimeter() 작성
    void getPerimeter() {
        System.out.println((width + height) * 2);
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 4: RectangleTodo 객체 생성
        RectangleTodo rectangle = new RectangleTodo(3,2);

        // TODO 5: 넓이와 둘레 출력
        rectangle.getArea();
        rectangle.getPerimeter();
    }
}
