package cn.o0k.lm.lm4;

/**

 * @Author: Trader
 */
public class LmDemo {
    public static void main(String[] args) {
        /**
         * 形参可是:接口,抽象类,具体类
         * lambda可是:接口(别的都不可以)
         *
         * 接口中有多个抽象方法是, 可以用匿名
         * 不可以用lambda
         *
         */
        // 匿名
        useInter(new Inter() {
            @Override
            public void show() {
                System.out.println("接口");
            }
        });

        useInter(() -> System.out.println("lm接口"));
        useAnimal(new Animal() {
            @Override
            public void method() {
                System.out.println("抽象类");
            }
        });

        useStudent(new Student(){
            @Override
            public void study() {
                System.out.println("具体类");
            }
        });
    }

    private static void useStudent(Student student) {
        student.study();
    }
    private static void useAnimal(Animal animal) {
        animal.method();
    }
    private static void useInter(Inter inter) {
        inter.show();
    }
}
