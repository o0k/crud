package learn.design.prototype.clone;

import java.util.Date;

/**
 * @author 张澎_9970
 * @date 2021.4.2 下午 2:33 星期五
 * @desc:
 * 深克隆:
 * 对于引用类型的属性, 也要克隆一下
 *
 *
 */

public class DeepClonePig implements Cloneable{
    private String name;
    private Date birthday;

    public DeepClonePig(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}' + super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepClonePig deepClonePig = (DeepClonePig)super.clone();
        deepClonePig.birthday = (Date)deepClonePig.birthday.clone();
        return deepClonePig;

    }


}
