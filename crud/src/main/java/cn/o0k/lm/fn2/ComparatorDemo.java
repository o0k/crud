package cn.o0k.lm.fn2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @DATE: 2020-09-06 星期日
 * @Author: Trader
 */
public class ComparatorDemo {
    public static void main(String[] args) {
        getComparator();
        List<String> arr = new ArrayList<>();
        arr.add("d");
        arr.add("bbbb");
        arr.add("cc");
        arr.add("aaa");
        System.out.println("排序前:" + arr);
        Collections.sort(arr,getComparator());
        System.out.println("排序后:" + arr);
    }

    /**
     * 自定义一个比较器
     * @return
     */
    private static Comparator<String> getComparator() {
        // 1.匿名内部类
        // return new Comparator<String>() {
        //     @Override
        //     public int compare(String o1, String o2) {
        //         return o1.length() - o2.length();
        //     }
        // };

        // 2.lambda 表达式
        // return (s1,s2) -> s1.length()-s2.length();

        // 3.方法引用
        return Comparator.comparingInt(String::length);

    }
}
