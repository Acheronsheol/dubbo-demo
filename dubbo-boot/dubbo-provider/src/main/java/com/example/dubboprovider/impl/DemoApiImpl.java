package com.example.dubboprovider.impl;

import com.example.dubboapi.manager.DemoApi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DemoApiImpl implements DemoApi {


    public static final Logger logger = LoggerFactory.getLogger(DemoApiImpl.class);

    @Override
    public String sayHello(String name) {
        logger.info("【提供者】【服务实现】---请求参数 name ：{}",name);
        return "hello"+ name +"(Springboot 整合 Dubbo --采用注解方式）";
    }

}
