package SunFa;

/**
 * @author 张澎_9970
 * @date 2021/4/1 0:19 星期四
 * @desc
 */
public class SunFa {

    public static void main(String[] args) {
        _11();
    }

    public static void _11() {
        // test commit 2021年4月3日
        int count = 0;
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        String str = "";

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                for (int k = i + j + 1; k < a.length; k++) {
                    str = a[i] + " × " + a[j] + " × " + a[k];
                    System.out.println(str);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
