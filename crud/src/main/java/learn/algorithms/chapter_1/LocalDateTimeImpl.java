package learn.algorithms.chapter_1;

import java.io.File;
import java.time.LocalDateTime;

/**
 * @author 张澎_9970
 * @date 2021.6.7 上午 10:42 星期一
 * @desc:
 */
public class LocalDateTimeImpl {
    public static void main(String[] args) {
        final File file = new File("E:\\zhp");
        final boolean exists = file.exists();
        if (!exists) {
            file.mkdir();
        }
        final String name = file.getName();
        System.out.println(name);

        final long length = file.length();
        System.out.println(length);
    }
}
