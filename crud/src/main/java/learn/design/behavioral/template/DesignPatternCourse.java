package learn.design.behavioral.template;

/**
 * @author 张澎_9970
 * @date 2021.4.6 下午 4:57 星期二
 * @desc:
 */
public class DesignPatternCourse extends AbstractCourse
{
    @Override
    void packageCourse() {
        System.out.println("提供课程Java源代码.");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
