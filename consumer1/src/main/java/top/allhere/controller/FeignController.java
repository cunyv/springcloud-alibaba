package top.allhere.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.allhere.client.TestClient;

/**
 * @Author zj_xianghong
 * @Date 2021/9/12 1:10
 * @Description TODO
 */
@RestController
@RequestMapping("/")
public class FeignController {

    @Autowired
    private TestClient testClient;

    @GetMapping("/hello")
    public String sayHello(){
        return testClient.sayHello();
    }
}
