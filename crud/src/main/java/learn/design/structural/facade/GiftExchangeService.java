package learn.design.structural.facade;

/**
 * @author 张澎_9970
 * @date 2021/4/3 13:42 星期六
 * @desc 礼物兑换_服务
 */
public class GiftExchangeService {
private QualifyService qualifyService;
private PointPaymentService pointPaymentService;
private ShippingService shippingService;

    public void setQualifyService(QualifyService qualifyService) {
        this.qualifyService = qualifyService;
    }

    public void setPointPaymentService(PointPaymentService pointPaymentService) {
        this.pointPaymentService = pointPaymentService;
    }

    public void setShippingService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public void giftExchange(PointGift pointGift) {
        if (qualifyService.isAvailable(pointGift)) {
            // 资格校验通过
            if(pointPaymentService.pay(pointGift)) {
                // 积分支付成功
                String shippingOrderNo = shippingService.shipGift(pointGift);
                System.out.println("物流系统下单成功! 订单号是" + shippingOrderNo);

            }


        }
    }
}
