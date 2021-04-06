package SunFa;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author 张澎_9970
 * @date 2021.4.5 下午 10:01 星期一
 * @desc: stack queue dequeue
 * last in first out
 * first in last out
 * <p>
 * dequeue: Double end queue
 * <p>
 * Priority Queue
 */
public class Algorithms4 {
    public static void main(String[] args) {
        boolean valid = new Algorithms4().isValid("()");
        System.out.println(valid);
    }
    // dequeue
    // 最近相关性, 栈
    // 最近相关性, 栈

    private static final Map<Character, Character> map = new HashMap<Character, Character>(4) {{
        put('{', '}');
        put('[', ']');
        put('(', ')');
        put('?', '?');
    }};

    // TODO
    public boolean isValid(String s) {
        if (s.length() > 0 && !map.containsKey(s.charAt(0))) {
            return false;
        }
        LinkedList<Character> stack = new LinkedList<Character>() {{
            add('?');
        }};
        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) {
                stack.addLast(c);
            } else if (map.get(stack.removeLast()).equals(c)) {
                return false;
            }
        }
        return stack.size() == 1;
    }

}
