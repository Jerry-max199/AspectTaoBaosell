package com.zzjm.Aspect;


import org.aspectj.lang.annotation.After;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
//切面类
@Component("aspectl")
@Aspect
public class Aspectl{
    @Before(value ="execution(public double com.zzjm.factory.UsbKingfactory.sell(int))")
    public void before(){
        System.out.println("欢迎购买u盘");
    }
    @After(value = "execution(public double com.zzjm.factory.UsbKingfactory.sell(int))")
    public void after(){
        System.out.println("返你一个满50减20的优惠卷");
    }


}
