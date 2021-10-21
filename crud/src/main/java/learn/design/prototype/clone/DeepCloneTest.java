package learn.design.prototype.clone;

import java.util.Date;

/**
 * @author 张澎_9970
 * @date 2021.4.2 下午 4:05 星期五
 * @desc:
 *
 * 浅克隆: 只克隆当前这个层次; 日期还是用的那个日期.
 *
 * 克隆也可以破坏单例模式.
 *
 */
public class DeepCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        /**
         * 1970年 1970-01-01 08:00:00 000
         */
        Date birthday = new Date(0L);

        DeepClonePig pig = new DeepClonePig("佩奇", birthday);
        DeepClonePig dcp = (DeepClonePig)pig.clone();

        pig.getBirthday().setTime(66666666666666666L);
        System.out.println(pig);
        System.out.println(dcp);

    }
}
