package learn.regex;


import learn.his.StorageTypeVO;

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

            String aa =  StorageTypeVO.PatientType.OUTP_PATIENT.toString();
            System.out.println(aa);
        }
    }
}
