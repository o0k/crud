package learn.design.structural.proxy;

/**
 * @author 张澎_9970
 * @date 2021.4.6 上午 11:03 星期二
 * @desc:
 */
public class OrderServiceImpl implements OrderService{
    /**
     *
     */
    private OrderDao orderDao;

    @Override
    public int saveOrder(Order order) {
        orderDao = new OrderDaoImpl();
        System.out.println("添加Order...");
        return this.orderDao.insert(order);
    }
}
