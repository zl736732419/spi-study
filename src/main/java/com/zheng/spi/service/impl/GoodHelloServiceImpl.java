package com.zheng.spi.service.impl;

import com.zheng.spi.service.HelloService;

/**
 * @Author zhenglian
 * @Date 2018/6/24 18:30
 */
public class GoodHelloServiceImpl implements HelloService {
    @Override
    public String hello(String msg) {
        return "good " + msg;
    }
}
