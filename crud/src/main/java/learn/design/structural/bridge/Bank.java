package learn.design.structural.bridge;

/**
 * @author 张澎_9970
 * @date 2021.4.6 上午 9:37 星期二
 * @desc: 银行_抽象层
 *
 */
public abstract class Bank {
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    /**
     * 声明成同样的并不是必须的.
     * Bank中的具体方法, 药委托给Account中的openAccount() 方法
     *
     *
     * @return
     */
    abstract Account openAccount();
}
