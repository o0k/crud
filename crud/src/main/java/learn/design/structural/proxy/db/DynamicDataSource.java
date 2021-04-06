package learn.design.structural.proxy.db;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author 张澎_9970
 * @date 2021/4/6 12:11 星期二
 * @desc
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    /**
     * 这个 返回值object, 就代表当前线程是哪个DB
     *
     * spring 的分库
     * @return
     */
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDBType();
    }


}
