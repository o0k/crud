package learn.algorithms.chapter_1;

import java.util.LinkedList;

/**
 * @author 张澎_9970
 * @date 2021.5.4 下午 2:56 星期二
 * @desc:
 */
public class LinkedListLearn {
    public static void main(String[] args) {
        LinkedList<User> userLinkedList = new LinkedList<>();
        User user = new User("张澎", 44);
        User user2 = new User("张澎2", 42);

        userLinkedList.add(user);
        userLinkedList.add(user2);
    }
}
