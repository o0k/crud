package learn.design.structural.proxy;

import lombok.Data;

/**
 * @author 张澎_9970
 * @date 2021.4.6 上午 10:38 星期二
 * @desc: 订单
 */
@Data
public class Order {
    /**
     * 订单数据
     */
    private Object orderInfo;

    /**
     * 订单属于哪个用户呢?
     */
    private Integer userId;



}
