package learn.design.behavioral.template;

/**
 * @author 张澎_9970
 * @date 2021.4.6 下午 4:33 星期二
 * @desc: 模板方法:
 * 1.一次性实现一个算法的不变的部分, 并将可变的行为留给子类类实现.
 * 2.
 *
 * 钩子方法: 模板对子类更进一步的开放
 *
 * 业务场景:
 *      1.
 *      2.
 *      3.
 *      4.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("后端S");
        AbstractCourse designPatternCourse = new DesignPatternCourse();
        designPatternCourse.makeCourse();
        System.out.println("后端E");

        System.out.println("前端S");
        AbstractCourse feCourse = new FECourse();
        feCourse.makeCourse();
        System.out.println("前端E");



    }
}
