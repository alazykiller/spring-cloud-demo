package com.zz.controller;

import com.zz.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 类描述：
 *
 * @author zz
 * @date 2018/9/28
 */
@RestController
public class DemoController {

    @Autowired
    private RestTemplate restTemplate;

    //@RequestMapping(value = "/test", method = RequestMethod.GET)
    //public String test() {
    //    return restTemplate.getForEntity("http://ORDER-SERVICE/orderno", String
    //            .class).getBody();
    //}

    @Autowired
    private RibbonService ribbonService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return ribbonService.testService();
    }
}
