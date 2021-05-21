package learn.everyday._0521;

import lombok.val;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 张澎_9970
 * @date 2021.5.21 上午 9:07 星期五
 * @desc: 2021年5月21日
 */
public class L0521 {
    public static void main(String[] args) {
        List<UserVO> vos = new ArrayList<UserVO>();
        for (int i = 0; i < 4; i++) {
            UserVO vo = new UserVO();
            vo.setAddress("雅士" + i);
            vo.setAge(i);
            vo.setName("机器_" + i);
            vos.add(vo);
        }

        StringBuilder builder = new StringBuilder();
        builder.append('A');
        builder.append('B');
        builder.append('C');
        char c = builder.charAt(1);
        System.out.println(c);

        CharSequence charSequence = builder.subSequence(0, 3);
        System.out.println(charSequence);

        int length = builder.length();
        System.out.println(length);

        val c1 = c;

        String zhp = "abcd";

    }
}
