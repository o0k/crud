package cn.zBasic_knowledge;

public class TuYa {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));


    }

    private static int fibonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 1;

        while (n-- > 0) {
            c = a + b + c; // 2
            b = c - a - b; // 1
            a = c - a - b; // 1
        }
        return a;
    }
}
