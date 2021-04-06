package learn.design.structural.bridge;

/**
 * @author 张澎_9970
 * @date 2021.4.6 上午 9:28 星期二
 * @desc: 账号
 *
 * 银行: 工行, 农行
 * 账号: 活期, 定期
 */
public interface Account {
    /**
     * 打开账号, 返回一个账号
     * @return Account 账号
     */
    Account openAccount();
    /**
     * 查看账号类型
     */
    void showAccountType();
}
