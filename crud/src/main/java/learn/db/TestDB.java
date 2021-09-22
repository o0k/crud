package learn.db;

import java.sql.*;

/**
 * @author 张澎_9970
 * @date 2021.7.13 上午 10:03 星期二
 * @desc:
 */
public class TestDB {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        String url = "jdbc:mysql://localhost:3306/zhp_schema?useSSL=false&serverTimezone=UTC&user=root&password=123456";
        // String url = "jdbc:mysql://119.45.157.172:3306/hispro_lis?useSSL=false&user=root&password=123456";
        String sql = "select * from zhp_table";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url);
            stmt = conn.createStatement();
            stmt.execute(sql);
            rs = stmt.executeQuery(sql);
            rs.last();
            System.out.println(rs.getRow());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
