package student.todo.interface_.p03;

interface DataAccessObjectTodo {
    // TODO 1: select/insert/update/delete 선언
}

class OracleDaoTodo implements DataAccessObjectTodo {
    // TODO 2: 네 메소드 구현
}

class MySqlDaoTodo implements DataAccessObjectTodo {
    // TODO 3: 네 메소드 구현
}

public class MainTodo {
    static void dbWork(DataAccessObjectTodo dao) {
        // TODO 4: 네 메소드 순서대로 호출
    }

    public static void main(String[] args) {
        // TODO 5: Oracle, MySql 각각 호출
    }
}
