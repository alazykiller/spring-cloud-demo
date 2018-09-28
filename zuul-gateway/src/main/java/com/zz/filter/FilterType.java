package com.zz.filter;

/**
 * 类描述：
 *
 * @author zz
 * @date 2018/9/28
 */
public class FilterType {

    /**
     * pre：可以在请求被路由之前调用
     * routing：在路由请求时候被调用
     * post：在routing和error过滤器之后被调用
     * error：处理请求时发生错误时被调用
     */
    public static String PRE = "pre";
}
