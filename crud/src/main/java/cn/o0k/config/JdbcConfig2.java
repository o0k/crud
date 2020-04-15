package cn.o0k.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration  // spring 把它当成Xml配置文件来看
// @PropertySource("classpath:jdbc.properties")
// @EnableConfigurationProperties(JdbcProperties.class)  // 使用配置属性
public class JdbcConfig2 {
/*
    // @Autowired 注入
    @Autowired
    JdbcProperties jdbcProperties;

    // 构造函数注入
    public JdbcConfig(JdbcProperties jdbcProperties) {
        this.jdbcProperties = jdbcProperties;
    }

 */


    // 这是java的注入
    // @Value("${jdbc.url}")
    // String url;
    // @Value("${jdbc.driverClassName}")
    // String driverClassName;
    // @Value("${jdbc.username}")
    // String username;
    // @Value("${jdbc.password}")
    // String password;

    /**
     * 扫描到@Bean,它就调用方法getDataSource()
     * 拿到 DataSource 对象
     * 把该对象 加入到 ApplicationContext 容器
     * 任何人都可以@Autowired注入了
     *
     * spring来掉, spring来传这个参数
     */
    /*
    @Bean
    public DataSource getDataSource(JdbcProperties prop) {  // spring的注入方式,谁调用,谁给我传  spring调用.
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(prop.getDriverClassName());
        dataSource.setUrl(prop.getUrl());
        dataSource.setUsername(prop.getUsername());
        dataSource.setPassword(prop.getPassword());

        System.out.println("dataSource");
        System.out.println(dataSource);
        return dataSource;
    }
    */
/*
    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource getDataSource() {
        return new DruidDataSource();
    }

 */
}
