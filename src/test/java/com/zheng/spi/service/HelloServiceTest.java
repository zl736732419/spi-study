package com.zheng.spi.service;

import org.junit.Test;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @Author zhenglian
 * @Date 2018/6/24 18:32
 */
public class HelloServiceTest {
    
    @Test
    public void test() {
        ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class);
        Iterator<HelloService> iterator = loader.iterator();
        HelloService helloService;
        String msg;
        while (iterator.hasNext()) {
            helloService = iterator.next();
            msg = helloService.hello("hello");
            System.out.println(msg);
        }

    }
    
    
}
