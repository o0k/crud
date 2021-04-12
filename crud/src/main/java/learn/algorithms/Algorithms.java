package learn.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @author 张澎_9970
 * @date 2021-04-03 21:40 星期六
 * @desc Algorithms: 算法
 */
public class Algorithms {

    static int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    static int[] a = new int[2];

    public static void main(String[] args) {
        Algorithms algorithms = new Algorithms();

        // ListNode listNode = algorithms.reverseList(null);
        // System.out.println(listNode.toString());

        show(algorithms.generateListNode());


    }

    /**
     * 1.
     * 两数之和
     */
    public int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    a[0] = i;
                    a[1] = j;
                    return a;
                }
            }
        }
        return new int[0];
    }

    /**
     * 15.
     * 三数之和
     */
    public List<List<Integer>> threeSum(int[] nums) {
        nums = new int[]{-1, 0, 1, 2, -1, -4};
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int k = 0; k < nums.length - 2; k++) {
            if (nums[k] > 0) {
                break;
            }
            if (k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }
            int i = k + 1, j = nums.length - 1;
            while (i < j) {
                int sum = nums[k] + nums[i] + nums[j];
                if (sum < 0) {
                    while (i < j && nums[i] == nums[++i]) {
                        ;
                    }
                } else if (sum > 0) {
                    while (i < j && nums[j] == nums[--j]) {
                        ;
                    }
                } else {
                    res.add(new ArrayList<>(Arrays.asList(nums[k], nums[i], nums[j])));
                    while (i < j && nums[i] == nums[++i]) {
                        ;
                    }
                    while (i < j && nums[j] == nums[--j]) {
                        ;
                    }
                }
            }
        }
        return res;
    }

    /**
     * 206
     * 反转链表
     * 1.暴力
     * 2.快慢指针
     */
    public boolean hasCycle(ListNode head) {

        HashSet<ListNode> nodesSeen = new HashSet<>();
        while (head != null) {
            if (nodesSeen.contains(head)) {
                return true;
            } else {
                nodesSeen.add(head);
            }
            head = head.next;
        }
        return false;
    }

    public ListNode reverseList(ListNode head) {
        head = generateListNode();
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    /**
     * 最近重复子问题
     * 1. 1 + 1 + 1
     * 2. 1 + 2
     * 3. 2 + 1
     * <p>
     * 核心问题: 你来到这个台阶的方法, 从前面一个台阶, 或者从前面2个台阶.
     * 解题: 只要最后的三个值:
     * result = f1 + f2
     * f1 = f2
     * f2 = result
     * <p>
     * 1.暴力
     * 2.最简单的情况怎么解决
     *
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <= n; ++i) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }

    /**
     * 盛最多水的容器_11
     *
     * @param arr 数组
     * @return int
     */
    public static int maxArea(int[] arr) {
        /** 前柱子 和 后柱子 下标 */
        int l = 0, r = arr.length - 1;
        /** 大面积 */
        int ans = 0;
        while (l < r) {
            int area = Math.min(arr[l], arr[r]) * (r - l);
            ans = Math.max(ans, area);
            if (arr[l] <= arr[r]) {
                ++l;
            } else {
                --r;
            }
        }
        return ans;
    }

    /**
     * create listNode
     */
    private ListNode generateListNode() {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        head.next = node2;
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        ListNode node4 = new ListNode(4);
        node3.next = node4;
        ListNode node5 = new ListNode(5);
        node4.next = node5;
        return head;
    }

    public static void show(ListNode head) {
        if (head == null) {
            System.out.println("EMPTY LIST!");
            return;
        }
        ListNode currNode = head;
        while (currNode.next != null) {
            System.out.print(currNode.val);
            System.out.print("->");
            currNode = currNode.next;
        }
        System.out.print(currNode.val);
        System.out.println();
    }

}
