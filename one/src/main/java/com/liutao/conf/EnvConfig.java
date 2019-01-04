package com.liutao.conf;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Created by zhouhh2 on 2017/1/5.
 */

@Configuration
@ComponentScan({"com.liutao"})
@EnableAsync
public class EnvConfig {
}
