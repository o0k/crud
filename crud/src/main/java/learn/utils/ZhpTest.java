package learn.utils;





import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 张澎_9970
 * @date 2021.7.7 下午 3:53 星期三
 * @desc:
 */
public class ZhpTest {

    public static void main(String[] args) {
        final Date date = new Date();
        final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        final String format1 = format.format(date);

        System.out.println(format1);


    }
}
