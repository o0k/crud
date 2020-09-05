package cn.o0k.lm.lm1;

/**
 * @author Administrator
 */
public class EatableDemo {

    /**
     *
     */
    public static void main(String[] args) {
        // 1.实现类类
        // 2.匿名内部类
        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("ddddddd");
            }
        });

        // 3.lambda
        useEatable(() -> System.out.println("lamb"));
        // 4.引用方法
        useEatable(System.out::println);


    }

    /**
     * 参数是接口,实际上是接口的实现类对象
     * @param e
     */
    private static void useEatable(Eatable e) {
        e.eat();
    }

}
