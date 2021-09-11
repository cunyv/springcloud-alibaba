package top.allhere.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author zj_xianghong
 * @Date 2021/9/12 1:00
 * @Description TODO
 */
@FeignClient(value = "producer1")
public interface TestClient {

    @GetMapping("/testFeign/sayHello")
    public String sayHello();
}
