package learn.design.structural.proxy.staticProxy;

import learn.design.structural.proxy.Order;

/**
 * @author 张澎_9970
 * @date 2021/4/6 13:08 星期二
 * @desc
 */
public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);

        /**
         * 没法注解@Component, 采样new的方式
         */
        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);


    }


}
