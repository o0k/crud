package learn.design.prototype.v2;

/**
 * @author 张澎_9970
 * @date 2021.4.2 下午 2:30 星期五
 * @desc: 抽象类, 实现克隆接口
 */
public abstract class A implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
