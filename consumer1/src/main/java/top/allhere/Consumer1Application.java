package top.allhere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author zj_xianghong
 * @Date 2021/9/12 0:58
 * @Description TODO
 */
@SpringBootApplication
@EnableFeignClients
public class Consumer1Application {

    public static void main(String[] args) {
        SpringApplication.run(Consumer1Application.class, args);
    }
}
