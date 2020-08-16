package cn.o0k.concurrency.chapter1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhp_e
 */
public class RowHandlerImpl implements RowHandler {
	@Override
	public List<User> handle(ResultSet rs) throws SQLException {
		List<User> list = new ArrayList<>();
		while (rs.next()) {
			int id = rs.getInt("id");
			String username = rs.getString("username");
			User user = new User();
			user.setId(id);
			user.setUsername(username);
			list.add(user);
		}
		return list;
	}
}
