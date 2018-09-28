package com.zz.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 类描述：
 *
 * @author zz
 * @date 2018/9/28
 */
@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "testServiceFallback")
    public String testService() {
        return restTemplate.getForEntity("http://ORDER-SERVICE/orderno", String
                .class).getBody();
    }

    public String testServiceFallback() {
        return "error";
    }
}
