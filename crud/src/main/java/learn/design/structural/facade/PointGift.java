package learn.design.structural.facade;

import lombok.Data;

/**
 * @author 张澎_9970
 * @date 2021-04-03 7:10 星期六
 * @desc 积分兑换礼物
 */
@Data
public class PointGift {

    private String name;

    public PointGift(String name) {
        this.name = name;
    }
}
