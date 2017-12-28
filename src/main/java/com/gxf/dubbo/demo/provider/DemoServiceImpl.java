package com.gxf.dubbo.demo.provider;

import com.gxf.dubbo.demo.DemoSerivce;

/**
 * Created by 58 on 2017/12/28.
 */
public class DemoServiceImpl implements DemoSerivce {
    public String sayHello(String name) {
        return "Hello " + name + " to dubbo!";
    }
}
