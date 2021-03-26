package com.zzjm.TaoBao;

import com.zzjm.Aspect.Aspectl;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
@Component("taobaosell")
public class TaoBaoSell implements InvocationHandler {
    private Object trag=null;

    public TaoBaoSell(Object trag) {
        this.trag = trag;
    }
    //Aspectl aspectl=new Aspectl();
    @Override
    public Object invoke(Object proxy, Method method, Object[] args)throws InvocationTargetException, IllegalAccessException{
        Object res=null;
       res=method.invoke(trag,args);
        //aspectl.before();
        if (res!=null){
            Double pirce=(Double) res;
            pirce=pirce+25;
            res=pirce;
        }
        //System.out.println("总价"+res);
       // aspectl.after();
        return res;

    }

}
