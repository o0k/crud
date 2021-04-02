package learn.design.structural.facade;

/**
 * @author 张澎_9970
 * @date 2021-04-03 7:27 星期六
 * @desc 物流_子系统
 */
public class ShippingService {
    /**
     * 物流
     */
    public String shipGift(PointGift p) {
        // 物流系统的对接逻辑
        System.out.println("进入物流系统");
        String shippingOrderNo = "物流订单号_666";
        return shippingOrderNo;
    }
}
