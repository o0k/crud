package learn.design.prototype.v1;

import java.text.MessageFormat;

/**
 * @author 张澎_9970
 * @date 2021.4.2 下午 1:57 星期五
 * @desc:
 */
public class MailUtil {
    /**
     * 发邮件
     */
    public static void sendMail(Mail mail) {
        String outputContent = "向{0}同学,邮件地址{1},邮件内容: {2},发送邮件成功.";
        System.out.println(MessageFormat.format(outputContent, mail.getName(), mail.getEmailAddress(), mail.getContent()));

    }
    /**
     * 保存邮件
     */
    public static void saveOriginMailRecord(Mail mail) {
        System.out.println("【SAVE】: 存储OriginMail记录, originMail:" + mail.getContent());
    }
}
