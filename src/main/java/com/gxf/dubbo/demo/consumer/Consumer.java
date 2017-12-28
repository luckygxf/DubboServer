package com.gxf.dubbo.demo.consumer;

import com.gxf.dubbo.demo.DemoSerivce;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 58 on 2017/12/28.
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-demo-consumer.xml"});
        context.start();
        //obtain proxy object for remote invocation
        DemoSerivce demoSerivce = (DemoSerivce) context.getBean("demoService");
        //execute removete invocation
        String hello = demoSerivce.sayHello("guanxianseng");
        //show the result
        System.out.println(hello);
    }
}
