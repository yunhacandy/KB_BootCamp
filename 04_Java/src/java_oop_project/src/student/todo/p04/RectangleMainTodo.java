package java_oop_project.src.student.todo.p04;

public class RectangleMainTodo {
    public static void main(String[] args) {
        // TODO 1: RectangleTodo 객체를 생성하세요. (가로 10, 세로 5)
        RectangleTodo rectangleTodo = new RectangleTodo(10,5);
        // TODO 2: "넓이: " + getArea() 결과를 출력하세요.
        System.out.println("넓이: " + rectangleTodo.getArea());
        // TODO 3: "둘레: " + getPerimeter() 결과를 출력하세요.
        System.out.println("둘레: " + rectangleTodo.getPerimeter());
    }
}
