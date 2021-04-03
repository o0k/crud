package learn.design.structural.facade;

/**
 * @author 张澎_9970
 * @date 2021-04-03 7:14 星期六
 * @desc 校验资格_子系统
 */
public class QualifyService {
    /** 是否有资格 */
    public boolean isAvailable(PointGift p) {
        /**
         * 复杂的校验逻辑
         * ....
         * ......
         * .........
         * .............
         */
        System.out.println("校验" + p.getName() + "积分资格通过!");
        return true;

    }
}
