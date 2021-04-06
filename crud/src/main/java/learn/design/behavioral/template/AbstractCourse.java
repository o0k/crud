package learn.design.behavioral.template;

/**
 * @author 张澎_9970
 * @date 2021.4.6 下午 4:50 星期二
 * @desc: 制作课程_抽象类
 */
public abstract class AbstractCourse {
    protected final void makeCourse() {
        this.makePPT();
        this.makeVideo();
        if (needWriteArticle()) {
            this.makeArticle();
        }
        this.packageCourse();
    }

    /**
     * 制作PPT,
     * 所有的子类都不需要重写的话, 就定义成final的方法
     */
    final void makePPT() {
        System.out.println("制作PPT");
    }
    final void makeVideo() {
        System.out.println("制作视频");
    }
    final void makeArticle() {
        System.out.println("编写手记_Article");
    }

    /**
     * 钩子方法
     */
    protected boolean needWriteArticle() {
        return false;
    }

    /**
     * 包装课程
     */
    abstract void packageCourse();

}
