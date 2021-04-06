package learn.design.structural.proxy.db;

/**
 * @author 张澎_9970
 * @date 2021/4/6 12:12 星期二
 * @desc DataSource 的上下文
 */
public class DataSourceContextHolder {
    /**
     * 该类的核心是threadLocal
     * 线程之间是隔离的,
     * 是通过ThreadLocalMap来实现的.
     *
     * 存放, datasource的beanName
     */
    private  static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<>();

    public static void setDBType(String dbType) {
        CONTEXT_HOLDER.set(dbType);
    }

    public static String getDBType( ) {
        return CONTEXT_HOLDER.get();
    }

    public static void clearDBType() {
        CONTEXT_HOLDER.remove();
    }

}
