package cn.o0k.lm.ref6;

/**
 * @DATE: 2020-09-06 星期日
 * @Author: Trader
 */
public class Demo {
    /**
     * 引用构造器:
     * 类名::new
     * Student::new
     */

    public static void main(String[] args) {
        useStudentBuilder((String name,int age) -> {
            return new Student(name,age);
        });
        useStudentBuilder((name,age) -> new Student(name,age));
        // 引用构造器
        useStudentBuilder(Student::new);
    }

    private static void  useStudentBuilder(StudentBuilder sb){
        Student stu = sb.build("张艾嘉", 56);
        System.out.println(stu);
    }
}
