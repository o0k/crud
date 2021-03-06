package cn.o0k.concurrency.chapter1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

/**
 * @author zhp_e
 */
public class RecordQueryTest {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/zhp", "root", "root");
        RecordQuery rq = new RecordQuery(connection);
        String sql = "select * from user";
        RowHandlerImpl rowHandler = new RowHandlerImpl();

        // test commit not push
        // test git 2021年3月31日

        List<User> list = (List<User>) rq.query(rowHandler, sql);
        for (User user : list) {
            System.out.println(user);
        }

    }
}
