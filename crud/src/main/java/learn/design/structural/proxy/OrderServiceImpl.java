package learn.design.structural.proxy;

/**
 * @author 张澎_9970
 * @date 2021.4.6 上午 11:03 星期二
 * @desc:
 */
public class OrderServiceImpl implements OrderService{

    private OrderDao orderDao;

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    @Override
    public int saveOrder(Order order) {
        int insert = orderDao.insert(order);
        System.out.println("添加Order...");
        return insert;
    }
}
