package com.secondkill.system.test;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/test")
public class Test {
    // 使用原生注解@Value()导入配置

//    @Value("${yxgname}")
    private String yxgname;


    @GetMapping("/t")
    public String providerTest()
    {
        return "我是provider，已成功获取nacos配置中心的数据：(name:" + yxgname  +")";
    }
}
