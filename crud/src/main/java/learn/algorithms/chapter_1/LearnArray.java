package learn.algorithms.chapter_1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author 张澎_9970
 * @date 2021.5.2 下午 3:30 星期日
 * @desc:
 */
public class LearnArray {
    public static void main(String[] args) {

        int[] a = new int[5];
        a[2] = 5;

        System.out.printf("a:"+ a);
        System.out.printf("a:"+ Arrays.toString(a));

        User user = new User();
        user.setUserName("张澎");
        user.setAge(44);
        User user2 = new User();
        user2.setUserName("朱晓红");
        user2.setAge(30);

        ArrayList<User> list = new ArrayList<>();
        list.add(0,user2);
        list.add(user);
        list.add(user2);
        list.add(user);
        System.out.printf("user:"+ list);





    }
}
