package learn.regex;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 张澎_9970
 * @date 2021.4.15 上午 9:30 星期四
 * @desc:
 */
public class Damo {
    public static void main(String[] args) {
        String regEx = "a+";
        String target = "aaabb";

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(target);

        while (matcher.find()) {
            String group = matcher.group();
            String group0 = matcher.group(0);
            String group1 = matcher.group(1);
            String group2 = matcher.group(2);
            System.out.printf("group: " + group);
            System.out.printf("group0: " + group0);
            System.out.printf("group1: " + group1);
            System.out.printf("group2: " + group2);
        }
    }
}
