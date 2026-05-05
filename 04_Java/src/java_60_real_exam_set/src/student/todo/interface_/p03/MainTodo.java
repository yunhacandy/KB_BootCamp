package java_60_real_exam_set.src.student.todo.interface_.p03;

interface DataAccessObjectTodo {
    // TODO 1: select/insert/update/delete 선언
    void select();
    void insert();
    void update();
    void delete();
}

class OracleDaoTodo implements DataAccessObjectTodo {
    // TODO 2: 네 메소드 구현
    @Override
    public void select() {
        System.out.println("Oracle DB에서 검색");
    }

    @Override
    public void insert() {
        System.out.println("Oracle DB에 삽입");
    }

    @Override
    public void update() {
        System.out.println("Oracle DB 수정");
    }

    @Override
    public void delete() {
        System.out.println("Oracle DB 삭제");
    }
}

class MySqlDaoTodo implements DataAccessObjectTodo {
    // TODO 3: 네 메소드 구현
    @Override
    public void select() {
        System.out.println("MySQL DB에서 검색");
    }

    @Override
    public void insert() {
        System.out.println("MySQL DB에 삽입");
    }

    @Override
    public void update() {
        System.out.println("MySQL DB 수정");
    }

    @Override
    public void delete() {
        System.out.println("MySQL DB 삭제");
    }
}

public class MainTodo {
    static void dbWork(DataAccessObjectTodo dao) {
        // TODO 4: 네 메소드 순서대로 호출
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }

    public static void main(String[] args) {
        // TODO 5: Oracle, MySql 각각 호출
        dbWork(new OracleDaoTodo());
        System.out.println();
        dbWork(new MySqlDaoTodo());
    }
}