package top.allhere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author zj_xianghong
 * @Date 2021/9/12 0:40
 * @Description TODO
 */
@SpringBootApplication
public class Producer1Application {
    public static void main(String[] args) {
        SpringApplication.run(Producer1Application.class, args);
    }
}
