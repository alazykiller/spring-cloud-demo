package com.zz.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * 类描述：
 *
 * @author zz
 * @date 2018/9/28
 */
@RestController
public class DemoController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/orderno", method = RequestMethod.GET)
    public String test() {
        String num = String.valueOf(new Random().nextInt(10000));
        logger.info("orderno: " + num);
        return "orderno: " + num;
    }

}
