package learn.design.structural.bridge;

/**
 * @author 张澎_9970
 * @date 2021.4.6 上午 9:33 星期二
 * @desc:
 */
public class DepositAccount implements Account{
    @Override
    public Account openAccount() {
        System.out.println("打开定期账号!");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账号!");
    }
}
