package learn.io;

import java.io.File;

/**
 * @author 张澎_9970
 * @date 2021.4.14 上午 9:14 星期三
 * @desc: IO流
 */
public class FileDamo {

    public static void main(String[] args) {
        File file = new File("E:\\learn\\learn_java\\io\\zhp.txt");
        boolean exists = file.exists();
        System.out.printf("exists: "+exists);






    }
}
