package learn.design.structural.proxy.dynamicproxy;

import learn.design.structural.proxy.Order;
import learn.design.structural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 张澎_9970
 * @date 2021.4.6 下午 3:52 星期二
 * @desc:
 */
public class OrderServiceDynamicProxy implements InvocationHandler {
    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind() {
        Class<?> cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(),this);
    }

    /**
     * proxy: ??
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        beforeMethod(argObject);
        /**
         * 要被增强的, 方法的返回值  | 增强不同的方法, 返回值类型不一定一样
         */
        Object object = method.invoke(target, args);
        afterMethod();
        return object;
    }

    private void beforeMethod(Object obj) {
        int userId = 0;
        System.out.println("dd");
        if (obj instanceof Order) {
            Order order = (Order) obj;
            userId = order.getUserId();
        }
        /**
         * 获得DB的路由 | 只会得到 0 或 1
         */
        int dbRouter = userId % 2;
        /**
         * 静态代理, 增强了service的实现, 把DB切到 DbRouter这个DB上
         */
        System.out.println("dong态代理分配到 [" + dbRouter + "] 处理数据.");

        // todo 设置 DataSource
        DataSourceContextHolder.setDBType(String.valueOf(dbRouter));

    }

    private void afterMethod() {

    }
}
