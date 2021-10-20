package learn.design.prototype.v1;

/**
 * @author 张澎_9970
 * @date 2021.4.2 下午 2:03 星期五
 * @desc:
 */
public class TestNoGood {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("initialize template!");
        for (int i = 0; i < 10; i++) {
            mail = new Mail();
            mail.setName("name:" + i);
            mail.setEmailAddress("aa" + i + "@126.com");
            mail.setContent("Congratulations, you won the lottery.");
            MailUtil.sendMail(mail);
        }
        // 存储还存最初new出来的Mail
        MailUtil.saveOriginMailRecord(mail);

    }
}
