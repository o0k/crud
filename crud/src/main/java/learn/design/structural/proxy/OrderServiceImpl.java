package learn.design.structural.proxy;

/**
 * @author 张澎_9970
 * @date 2021.4.6 上午 11:03 星期二
 * @desc:
 */
public class OrderServiceImpl implements OrderService{

    private OrderDao orderDao;

    @Override
    public int saveOrder(Order order) {
        OrderDao orderDao = new OrderDao() {
            @Override
            public int insert(Order order) {
                return 0;
            }
        };
        int insert = this.orderDao.insert(order);
        System.out.println("添加Order...");
        return insert;
    }
}
