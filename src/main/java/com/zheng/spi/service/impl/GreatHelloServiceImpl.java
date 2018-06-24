package com.zheng.spi.service.impl;

import com.zheng.spi.service.HelloService;

/**
 * @Author zhenglian
 * @Date 2018/6/24 18:29
 */
public class GreatHelloServiceImpl implements HelloService {
    @Override
    public String hello(String msg) {
        return "great " + msg;
    }
}
