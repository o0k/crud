package learn.design.structural.proxy;

/**
 * @author 张澎_9970
 * @date 2021.4.6 上午 11:03 星期二
 * @desc:
 */
public class OrderDaoImpl implements OrderDao{
    @Override
    public int insert(Order order) {
        System.out.println("insert");
        return 1;
    }
}
