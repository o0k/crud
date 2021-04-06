package learn.design.structural.bridge;

/**
 * @author 张澎_9970
 * @date 2021.4.6 上午 9:34 星期二
 * @desc:
 */
public class SavingAccount implements Account{
    @Override
    public Account openAccount() {
        System.out.println("打开活期账号!");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账号.");
    }
}
