package cn.base;

import java.io.File;

public class ReadFile {
    public static void main(String[] args) {
        File file = new File("tt.txt");
        if (file.exists()){
            System.out.println("文件已经存在");
        }
        else {
            System.out.println("文件不存在");

        }
        boolean mkdir = file.mkdir();
        System.out.println(mkdir);
    }
}
