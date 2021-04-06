package learn.design.structural.bridge;

import learn.design.prototype.v2.B;

/**
 * @author 张澎_9970
 * @date 2021.4.6 上午 9:55 星期二
 * @desc: 实现层
 */
public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        /**
         * 构造的时候,传入的什么Account,
         * 就返回什么Account
         */
        System.out.println("打开中国农业银行账号.");
        return account;
    }
}
