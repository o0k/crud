package learn.design.structural.proxy.staticProxy;

import learn.design.structural.proxy.Order;
import learn.design.structural.proxy.OrderService;
import learn.design.structural.proxy.OrderServiceImpl;
import learn.design.structural.proxy.db.DataSourceContextHolder;

/**
 * @author 张澎_9970
 * @date 2021.4.6 上午 11:13 星期二
 * @desc:
 */
public class OrderServiceStaticProxy {
    /**
     * 注入目标对象 OrderService
     */
    private OrderService orderService;

    /**
     * 对saveOrder方法, 增强. 使用同样的方法名
     * 使用不同的方法名, 也是OK的
     */
    public int saveOrder(Order order) {
        beforeMethod(order);
        orderService = new OrderServiceImpl();
        int result = orderService.saveOrder(order);

        /**
         * 根据userId的不同
         */
        afterMethod();
        return result;
    }

    /**
     * 增强就有before after
     */
    private void beforeMethod(Order order) {
        Integer userId = order.getUserId();
        /**
         * 获得DB的路由 | 只会得到 0 或 1
         */
        int dbRouter = userId % 2;
        /**
         * 静态代理, 增强了service的实现, 把DB切到 DbRouter这个DB上
         */
        System.out.println("静态代理分配到 [" + dbRouter + "] 处理数据.");

        // todo 设置 DataSource
        DataSourceContextHolder.setDBType(String.valueOf(dbRouter));
        System.out.println("before");

    }

    private void afterMethod() {
        System.out.println("after");
    }

}
