package learn.design.structural.proxy;

/**
 * @author 张澎_9970
 * @date 2021.4.6 上午 10:45 星期二
 * @desc:
 */
public interface OrderService {
    /**
     * save
     * @return int 生效行数
     */
    int saveOrder(Order order);
}
