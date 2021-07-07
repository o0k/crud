package learn.utils;
import org.apache.commons.lang3.time.DateFormatUtils;

import java.lang.management.ManagementFactory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.apache.commons.lang3.StringUtils;

/**
 * 时间工具类
 *
 * @author yangtao
 */
public class DateUtils extends org.apache.commons.lang3.time.DateUtils {
    public static String YYYY = "yyyy";

    public static String YYYY_MM = "yyyy-MM";

    public static String YYYY_MM_DD = "yyyy-MM-dd";

    public static String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";

    public static String YYYYMMDD = "yyyyMMdd";

    public static String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

    private static String[] parsePatterns = {
            "yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm", "yyyy-MM",
            "yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm", "yyyy/MM",
            "yyyy.MM.dd", "yyyy.MM.dd HH:mm:ss", "yyyy.MM.dd HH:mm", "yyyy.MM"};

    /**
     * 获取当前Date型日期
     *
     * @return Date() 当前日期
     */
    public static Date getNowDate() {
        return new Date();
    }

    public static String formatDate(Date date, String pattern) {
        return new SimpleDateFormat(pattern).format(date);
    }

    /**
     * 获取当前日期, 默认格式为yyyy-MM-dd
     *
     * @return String
     */
    public static String getDate() {
        return dateTimeNow(YYYY_MM_DD);
    }

    public static final String getTime() {
        return dateTimeNow(YYYY_MM_DD_HH_MM_SS);
    }

    public static final String dateTimeNow() {
        return dateTimeNow(YYYYMMDDHHMMSS);
    }

    public static final String dateTimeNow(final String format) {
        return parseDateToStr(format, new Date());
    }

    public static final String dateTime(final Date date) {
        return parseDateToStr(YYYY_MM_DD, date);
    }

    public static final String parseDateToStr(final String format, final Date date) {
        return new SimpleDateFormat(format).format(date);
    }

    public static final Date dateTime(final String format, final String ts) {
        try {
            return new SimpleDateFormat(format).parse(ts);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 日期路径 即年/月/日 如2018/08/08
     */
    public static final String datePath() {
        Date now = new Date();
        return DateFormatUtils.format(now, "yyyy/MM/dd");
    }

    /**
     * 日期路径 即年/月/日 如20180808
     */
    public static final String dateTime() {
        Date now = new Date();
        return DateFormatUtils.format(now, "yyyyMMdd");
    }

    /**
     * 日期型字符串转化为日期 格式
     */
    public static Date parseDate(Object str) {
        if (str == null) {
            return null;
        }
        try {
            return parseDate(str.toString(), parsePatterns);
        } catch (ParseException e) {
            return null;
        }
    }

    /**
     * 获取服务器启动时间
     */
    public static Date getServerStartDate() {
        long time = ManagementFactory.getRuntimeMXBean().getStartTime();
        return new Date(time);
    }

    /**
     * 计算两个时间差
     */
    public static String getDatePoor(Date endDate, Date nowDate) {
        long nd = 1000 * 24 * 60 * 60;
        long nh = 1000 * 60 * 60;
        long nm = 1000 * 60;
        // long ns = 1000;
        // 获得两个时间的毫秒时间差异
        long diff = endDate.getTime() - nowDate.getTime();
        // 计算差多少天
        long day = diff / nd;
        // 计算差多少小时
        long hour = diff % nd / nh;
        // 计算差多少分钟
        long min = diff % nd % nh / nm;
        // 计算差多少秒//输出结果
        // long sec = diff % nd % nh % nm / ns;
        return day + "天" + hour + "小时" + min + "分钟";
    }

    public static String dateFormatTime(Date date, String format) {
        if (null == date || StringUtils.isEmpty(format)) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    /**
     * 日期格式转换 yyyy-MM-dd
     * @param date
     * @return
     */
//    public static String getDateToString(Date date) {
//        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
//        String dateStr = sf.format(date);
//        return dateStr;
//    }
//

    /**
     * 日期格式问题
     *
     * @param format
     * @param date
     * @return
     * @author dingwei
     */
    public static Date dateFormatDate(String format, Date date) {
        if (null == date || StringUtils.isEmpty(format)) {
            return null;
        }
        String s = parseDateToStr(format, date);
        try {
            Date dateFormat = dateTime(format, s);
            return dateFormat;
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 根据生日，返回几岁几月几天，日期格式支持 yyyy-MM-dd的基础和扩展
     *
     * @param birth
     * @return
     */
    public static String getAgeStr(String birth) {
        if (StringUtils.isNotEmpty(birth)) {
            birth = birth.substring(0, 10).replace("-", "");
            int birthYear = Integer.parseInt(birth.substring(0, 4));
            int birthMonth = Integer.parseInt(birth.substring(4, 6));
            int birthDay = Integer.parseInt(birth.substring(6, 8));
            Calendar birthday = new GregorianCalendar(birthYear, birthMonth, birthDay);
            Calendar now = Calendar.getInstance();
            int day = now.get(Calendar.DAY_OF_MONTH) - birthday.get(Calendar.DAY_OF_MONTH);
            int month = now.get(Calendar.MONTH) - birthday.get(Calendar.MONTH) + 1;
            int year = now.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);
            //按照减法原理，先day相减，不够向month借；然后month相减，不够向year借；最后year相减。
            if (day < 0) {
                month -= 1;
                //得到上一个月，用来得到上个月的天数。
                now.add(Calendar.MONTH, -1);
                day = day + now.getActualMaximum(Calendar.DAY_OF_MONTH);
            }
            if (month < 0) {
                month = (month + 12) % 12;
                if (year > 0) {
                    year--;
                }
            }
            return year + "岁" + month + "月" + day + "天";
        } else {
            return "";
        }
    }

    /**
     * 根据病人生日获取年龄
     */
    public static int getAgeYear(String patientBirth) {
        String nowYear = DateUtils.parseDateToStr(DateUtils.YYYY, DateUtils.getNowDate());
        String patBirth = patientBirth.substring(0, 4);
        int result = Integer.valueOf(nowYear) - Integer.valueOf(patBirth);
        return result;
    }

    /**
     * 获取当前月份之前指定月份的第一天 传0代表当前月
     *
     * @param num 当前月份之前的第几个月
     * @return
     * @author dingwei
     */
    public static String getFirstDayOfMonth(int num) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, num);//上个月
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        String firstDay = format.format(calendar.getTime()) + " 00:00:00";
        return firstDay;
    }

    /**
     * 获取当前月份之前指定月份的最后一天 传0代表当前月
     *
     * @param num
     * @return
     * @author dingwei
     */
    public static String getLastDayOfMonth(int num) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, num + 1);//上个月
        calendar.set(Calendar.DAY_OF_MONTH, 0);
        String lastDay = format.format(calendar.getTime()) + " 00:00:00";
        return lastDay;
    }

    /**
     * 获取传入日期的月份最后一天
     *
     * @param dateStr
     * @return
     * @author dingwei
     */
    public static String getAssignLastDayOfMonth(String dateStr) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Calendar cal = Calendar.getInstance();
            int year = Integer.parseInt(dateStr.substring(0, 4));//获取年份
            int month = Integer.parseInt(dateStr.substring(5, 7));//获取月份
            int day = 0;
            cal.set(Calendar.YEAR, year);
            cal.set(Calendar.MONTH, month);
            cal.set(Calendar.DAY_OF_MONTH, 0);
            String lastDay = format.format(cal.getTime()) + " 00:00:00";
            return lastDay;
        } catch (Exception e) {
            throw new RuntimeException("获取日期失败！！！！！！！！！！！！！！！");
        }
    }

    /**
     * 获取传入日期的月份第一天
     *
     * @param dateStr
     * @return
     * @author dingwei
     */
    public static String getAssignFisrtDayOfMonth(String dateStr) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Calendar cal = Calendar.getInstance();
            int year = Integer.parseInt(dateStr.substring(0, 4));//获取年份
            int month = Integer.parseInt(dateStr.substring(5, 7));//获取月份
            int day = 0;
            cal.set(Calendar.YEAR, year);
            cal.set(Calendar.MONTH, month - 1);
            cal.set(Calendar.DAY_OF_MONTH, 1);
            String lastDay = format.format(cal.getTime()) + " 00:00:00";
            return lastDay;
        } catch (Exception e) {
            throw new RuntimeException("获取日期失败！！！！！！！！！！！！！！！");
        }
    }

    /**
     * <p>获取当前时间戳的当月第一天的时间戳(时:分:秒.毫秒为 00:00:00.000)</p>
     *
     * @date 2020/10/10
     */
    public static long getMillsAtFirstDayOfMonth(long timestamp) {
        Calendar cal = Calendar.getInstance();

        cal.setTimeInMillis(timestamp);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);

        return cal.getTimeInMillis();
    }

    /**
     * <p>获取当前时间戳的当月最后一天的时间戳(时:分:秒.毫秒为 23:59:59.999)</p>
     *
     * @date 2020/10/10
     */
    public static long getMillsAtLastDayOfMonth(long timestamp) {
        Calendar cal = Calendar.getInstance();

        cal.setTimeInMillis(getMillsAtFirstDayOfMonth(timestamp));
        int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        cal.add(Calendar.DAY_OF_MONTH, days);
        cal.add(Calendar.MILLISECOND, -1);

        return cal.getTimeInMillis();
    }

    public static long getMillsOfThisDayBegin(long timestamp) {
        Calendar cal = Calendar.getInstance();

        cal.setTimeInMillis(timestamp);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);

        return cal.getTimeInMillis();
    }

    public static long getMillsOfThisDayEnd(long timestamp) {
        Calendar cal = Calendar.getInstance();

        cal.setTimeInMillis(timestamp);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        cal.set(Calendar.MILLISECOND, 999);

        return cal.getTimeInMillis();
    }


    /**
     * <p>String | 年月日时分秒  转 Date</p>
     * <p>如:</p>
     * <p>String 20201019142845</p>
     * <p>Date 2020-10-19 14:28:45</p>
     *
     * @param yearToSecond 年月日时分秒
     * @return date
     * @author: 张澎_9970
     */
    public static Date yearToSecond2Date(String yearToSecond) {
        int length = yearToSecond.length();
        if (length < 14) {
            StringBuffer temp = new StringBuffer();
            temp.append(yearToSecond);
            int makeUp = 14 - length;
            for (int i = 0; i < makeUp; i++) {
                temp.append("0");
            }
            yearToSecond = temp.toString();
        }
        String year = yearToSecond.substring(0, 4);
        String month = yearToSecond.substring(4, 6);
        String day = yearToSecond.substring(6, 8);
        String hour = yearToSecond.substring(8, 10);
        String minute = yearToSecond.substring(10, 12);
        String second = yearToSecond.substring(12, 14);
        String stringDate = year + "-" + month + "-" + day + " " + hour + ":" + minute + ":" + second;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(YYYY_MM_DD_HH_MM_SS);
        Date date = null;
        try {
            date = simpleDateFormat.parse(stringDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
