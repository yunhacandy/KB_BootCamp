package java_oop_project.src.student.todo.p07;

public class ShopServiceMainTodo {
    public static void main(String[] args) {
        // TODO 1: getInstance()를 이용해 obj1, obj2를 얻으세요.
        ShopServiceTodo shopServiceTodo1 = ShopServiceTodo.getInstance();
        ShopServiceTodo shopServiceTodo2 = ShopServiceTodo.getInstance();

        // TODO 2: 두 참조가 같으면 "같은 ShopService 객체입니다."를 출력하세요.
        if (shopServiceTodo1 == shopServiceTodo2) {
            System.out.println("같은 ShopService 객체입니다.");
        }
        // TODO 3: 아니면 "다른 ShopService 객체입니다."를 출력하세요.
        else {
            System.out.println("다른 ShopService 객체입니다.");
        }
    }
}
