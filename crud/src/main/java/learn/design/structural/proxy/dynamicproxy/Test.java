package learn.design.structural.proxy.dynamicproxy;

import learn.design.structural.proxy.Order;
import learn.design.structural.proxy.OrderService;
import learn.design.structural.proxy.OrderServiceImpl;

/**
 * @author 张澎_9970
 * @date 2021.4.6 下午 4:13 星期二
 * @desc:
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(0);

        OrderService orderServiceDynamicProxy = (OrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        orderServiceDynamicProxy.saveOrder(order);
    }
}
