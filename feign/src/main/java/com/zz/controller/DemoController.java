package com.zz.controller;

import com.zz.service.Intf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类描述：
 *
 * @author zz
 * @date 2018/9/28
 */
@RestController
public class DemoController {

    @Autowired
    private Intf intf;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return intf.test();
    }
}
