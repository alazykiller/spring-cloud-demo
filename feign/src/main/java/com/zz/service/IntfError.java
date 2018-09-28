package com.zz.service;

import org.springframework.stereotype.Component;

/**
 * 类描述：
 *
 * @author zz
 * @date 2018/9/28
 */
@Component
public class IntfError implements Intf {

    @Override
    public String test() {
        return "feign error";
    }
}
