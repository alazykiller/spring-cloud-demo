package com.zz.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 类描述：
 *
 * @author zz
 * @date 2018/9/28
 */
//@FeignClient("order-service")
@FeignClient(value = "order-service", fallback = IntfError.class)
public interface Intf {

    //对应client中的服务
    @RequestMapping(method = RequestMethod.GET, value = "/orderno")
    String test();
}
