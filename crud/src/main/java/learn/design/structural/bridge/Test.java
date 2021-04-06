package learn.design.structural.bridge;

/**
 * @author 张澎_9970
 * @date 2021.4.6 上午 10:10 星期二
 * @desc:
 */
public class Test {
    public static void main(String[] args) {

        ICBCBank icbcBank = new ICBCBank(new DepositAccount());
        Account account = icbcBank.openAccount();
        account.showAccountType();
    }
}
