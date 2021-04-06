package SunFa;

/**
 * @author 张澎_9970
 * @date 2021/4/1 0:19 星期四
 * @desc
 */
public class SunFa {

    static int num = 10;
    static int[] a = {1, 12, 3, 4, 5, 6, 7, 4, 9};


    public static void main(String[] args) {
        maxArea();
    }

    public static void _141() {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * 盛水最多的容器
     */
    public static void maxArea() {

        int max = 0;
        int len = a.length;
        for (int i = 0; i < a.length; i++) {
        }
        System.out.println(max);
    }

}
