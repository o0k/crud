package learn.design.prototype.v1;

import lombok.Data;

/**
 * @author 张澎_9970
 * @date 2021.4.2 下午 1:54 星期五
 * @desc: 原型模式
 * 直接有目标类, 实现克隆接口,
 */
@Data
public class Mail implements Cloneable{
    private String name;
    private String emailAddress;
    private String content;

    public Mail() {
        System.out.println("Mail class constructor.");
    }

    /**
     * 重写clone方法， 就可以实现克隆。
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("Clone Mail Object.");
        return super.clone();
    }

    @Override
    public String toString() {
        return "[非Lombok，Mail{" +
                "name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", content='" + content + '\'' +
                '}' + super.toString() + "]";
    }
}
