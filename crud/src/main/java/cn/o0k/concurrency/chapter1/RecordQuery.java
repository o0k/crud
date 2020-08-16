package cn.o0k.concurrency.chapter1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author zhp_e
 */
public class RecordQuery {
	/**
	 * 连接
	 */
	Connection connection;

	public RecordQuery(Connection connection) {
		this.connection = connection;
	}

	public <T> T query(RowHandler<T> handler, String sql, Object...params) throws SQLException {

		try(PreparedStatement stmt = connection.prepareStatement(sql)) {
			int index = 1;
			for (Object param : params) {
				stmt.setObject(index++, param);
			}

			ResultSet rs = stmt.executeQuery();

			return handler.handle(rs);
		}

	}
}
