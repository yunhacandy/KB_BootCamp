package java_60_real_exam_set.src.student.todo.oop.p06;

class ShopServiceTodo {
    // TODO 1: private static final 싱글톤 객체 선언
    // 싱글톤 객체는 어플리케이션 전체에서 특정 클래스의 인스턴스를 하나만 생성하여
    // 고정된 메모리 영역에서 공유해서 사용하는 디자인 패턴
    private static final ShopServiceTodo instance = new ShopServiceTodo();

    // TODO 2: private 생성자 작성
    // 생성자를 private으로 막아서 외부에서 new 못하게 함
    private ShopServiceTodo() {

    }

    // TODO 3: public static getInstance() 작성
    // 객체를 반환하는 메서드
    public static ShopServiceTodo getInstance() {
        return instance; // 항상 같은 객체 반환
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 4: getInstance() 두 번 호출하여 같은 객체인지 비교
        ShopServiceTodo s1 = ShopServiceTodo.getInstance();
        ShopServiceTodo s2 = ShopServiceTodo.getInstance();

        // 같은 객체인지 비교
        System.out.println(s1 == s2);
    }
}
