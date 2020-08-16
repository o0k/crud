package cn.o0k.concurrency.chapter1;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author zhp_e
 */
public interface RowHandler<T> {
	/**
	 * 把rs处理好，封装成T，返回T
	 *
	 * @param rs
	 * @return
	 */
	T handle(ResultSet rs) throws SQLException;
}
