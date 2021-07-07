package learn.algorithms.chapter_1;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;

/**
 * @author 张澎_9970
 * @date 2021.6.4 上午 10:47 星期五
 * @desc:
 */
public class TuYa2 {
    public static void main(String[] args) {
        LocalDateTime localDateTime;

        // 生成随机数, 我想一秒钟在控制台打印一个?
        final Random random = new Random();
        for (int j = 0; j < 1000; j++) {
        final int i = random.nextInt(101);
            System.out.println(i);
        }
        //


    }
}
