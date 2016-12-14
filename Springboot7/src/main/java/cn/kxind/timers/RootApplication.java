package cn.kxind.timers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by Administrator on 2016/12/14.
 */

@SpringBootApplication
@EnableScheduling
public class RootApplication {
    public static void main(String[] args) {
        SpringApplication.run(RootApplication.class,args);
    }
}
