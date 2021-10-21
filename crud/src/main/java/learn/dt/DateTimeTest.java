package learn.dt;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author 张澎_9970
 * @date 2021.10.21 下午 3:08 星期四
 * @desc:
 */
public class DateTimeTest {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONTH);

        Date time = calendar.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = sdf.format(time);

        System.out.println(format);




    }
}
