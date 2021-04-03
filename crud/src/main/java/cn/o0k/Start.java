package cn.o0k;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Start {
    public static void main(String[] args) {
        SpringApplication.run(Start.class);
    }

    // test ignore 2020年6月7日 星期日

    // 2020年6月11日

    // test ignore 2020年6月7日 星期日

    // test commit
}
