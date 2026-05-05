package java_60_real_exam_set.src.student.todo.inheritance.p05;

class VehicleTodo {
    // TODO 1: run() 작성
    void run(){
        System.out.println("차량이 달립니다");
    }
}

class BusTodo extends VehicleTodo {
    // TODO 2: run() 오버라이딩
    @Override
    void run(){
        System.out.println("버스가 달립니다");
    }
}

class DriverTodo {
    // TODO 3: drive(VehicleTodo vehicle) 작성
    void drive(VehicleTodo vehicle){
        vehicle.run();
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 4: DriverTodo가 BusTodo를 운전하도록 호출
        DriverTodo driver = new DriverTodo();
        BusTodo bus = new BusTodo();

        driver.drive(bus);
    }
}
