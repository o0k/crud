package learn.design.prototype.v1;

/**
 * @author 张澎_9970
 * @date 2021.4.2 下午 2:03 星期五
 * @desc:
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("initialize template!");
        for (int i = 0; i < 10; i++) {
            // 克隆的时候是不调用构造器的
            Mail mailClone = (Mail)mail.clone();
            mailClone.setName("name:" + i);
            mailClone.setEmailAddress("aa" + i + "@126.com");
            mailClone.setContent("Congratulations, you won the lottery.");
            MailUtil.sendMail(mailClone);
            System.out.println(mailClone);
        }
        // 存储还存最初new出来的Mail
        MailUtil.saveOriginMailRecord(mail);

    }
}
