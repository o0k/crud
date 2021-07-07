package learn.utils;

import java.sql.Time;
import java.util.TimeZone;

/**
 * @author 张澎_9970
 * @date 2021.7.7 上午 9:41 星期三
 * @desc:
 */
public class TimeUtil {
    public static final int SECONDS_IN_DAY = 60 * 60 * 24;
    public static final long MILLIS_IN_DAY = 1000L * SECONDS_IN_DAY;

    public static boolean isSameDayOfMillis(final long ms1, final long ms2) {
        final long interval = ms1 - ms2;
        return interval < MILLIS_IN_DAY && interval > -1 * MILLIS_IN_DAY && toDay(ms1) == toDay(ms2);
    }

    private static long toDay(long millis) {
        return (millis + TimeZone.getDefault().getOffset(millis)) / MILLIS_IN_DAY;
    }
}
