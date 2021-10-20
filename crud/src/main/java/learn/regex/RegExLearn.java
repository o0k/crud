package learn.regex;

/**
 * @author 张澎_9970
 * @date 2021.10.15 上午 9:25 星期五
 * @desc:
 */
public class RegExLearn {
    public static void main(String[] args) {
        match();
    }

    public static void match() {
        String str = "abcde,dfet,ge23";
        final boolean matches = str.matches("[a-z]");
        System.out.println(matches);
    }


    public static void replace() {
        String str = "abc%efg%uor%";
        final String replace = str.replace("%", "##");
        System.out.println(replace);
    }

    public static void mm() {
        String str = "oneTowThreeDufourFive";
        String regEx = "[A-Z]";
        String[] split = str.split(regEx);
        for (String s : split) {
            System.out.println(s);
        }
    }
}
