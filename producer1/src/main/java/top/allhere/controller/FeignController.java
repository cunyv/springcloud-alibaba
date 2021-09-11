package top.allhere.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zj_xianghong
 * @Date 2021/9/12 1:08
 * @Description TODO
 */
@RestController
@RequestMapping("/testFeign")
public class FeignController {

    @GetMapping("/sayHello")
    public String sayHello(){
        return "Hello!";
    }
}
