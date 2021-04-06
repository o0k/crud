package learn.design.structural.bridge;

/**
 * @author 张澎_9970
 * @date 2021.4.6 上午 9:55 星期二
 * @desc:
 */
public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        /**
         * 构造的时候,传入的什么Account,
         * 就返回什么Account
         */
        System.out.println("打开工商银行账号.");
        return account;
    }
}
