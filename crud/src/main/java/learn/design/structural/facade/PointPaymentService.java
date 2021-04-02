package learn.design.structural.facade;

/**
 * @author 张澎_9970
 * @date 2021-04-03 7:20 星期六
 * @desc 积分支付_子系统
 */
public class PointPaymentService {

    public boolean pay(PointGift p) {
        /**
         * 扣减积分
         * ...
         * .....
         * .......
         */
        System.out.println("支付" + p.getName() + "积分扣减完成!");
        return true;
    }
}
