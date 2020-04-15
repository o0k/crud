package cn.o0k.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * spring boot 方式的注入方式
 */
// @ConfigurationProperties(prefix = "jdbc")    // 编写配置文件的属性的
@Data
public class JdbcProperties {
    String url;
    String driverClassName;
    String username;
    String password;
}
