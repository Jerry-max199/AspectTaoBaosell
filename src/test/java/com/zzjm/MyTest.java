package com.zzjm;

import com.zzjm.Service.UsbSell;
import com.zzjm.TaoBao.TaoBaoSell;
import com.zzjm.factory.UsbKingfactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MyTest {
  //  String config="applicationContext.xml";
  //  ApplicationContext applicationContext=new ClassPathXmlApplicationContext(config);
    @Test
      public void test01(){

        //UsbSell aspectl=(UsbSell) applicationContext.getBean("usbkingfactory");
        //aspectl.sell(1);
        UsbSell factory=new UsbKingfactory();
        InvocationHandler invocationHandler=new TaoBaoSell(factory);
        UsbSell proxy=(UsbSell)Proxy.newProxyInstance(factory.getClass().getClassLoader(),factory.getClass().getInterfaces(),invocationHandler);
        double pirce=proxy.sell(1);
         System.out.println("总价"+pirce);
         //
    }

}
