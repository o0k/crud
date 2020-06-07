package cn.o0k;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Xxx {
    public static void main(String[] args) {
        SpringApplication.run(Xxx.class);
    }

    // test ignore 2020年6月7日 星期日
    // test ignore 2020年6月7日 星期日
}
