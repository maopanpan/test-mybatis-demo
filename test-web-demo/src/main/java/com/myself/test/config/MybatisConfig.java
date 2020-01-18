package com.myself.test.config;

import com.myself.test.db.plugin.AutoIdInterceptor;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 类名称：MybatisConfig<br>
 * 类描述：<br>
 * 创建时间：2020年01月17日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
@Configuration
public class MybatisConfig {

    @Bean
    ConfigurationCustomizer mybatisConfigurationCustomizer() {
        return new ConfigurationCustomizer() {
            @Override
            public void customize(org.apache.ibatis.session.Configuration configuration) {
                configuration.addInterceptor(new AutoIdInterceptor());
            }
        };
    }
}
