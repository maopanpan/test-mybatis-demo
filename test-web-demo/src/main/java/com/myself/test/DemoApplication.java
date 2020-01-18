package com.myself.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 类名称：DemoApplication<br>
 * 类描述：<br>
 * 创建时间：2020年01月12日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
@SpringBootApplication(scanBasePackages = "com.myself.test")
@MapperScan(basePackages = {"com.myself.test.db.mapper"})
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
