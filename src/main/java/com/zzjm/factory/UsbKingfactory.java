package com.zzjm.factory;

import com.zzjm.Service.UsbSell;
import org.springframework.stereotype.Component;

@Component("usbkingfactory")
public class UsbKingfactory implements UsbSell {
    @Override
    public double sell(int amount) {
        double pirce = 0;
        pirce = amount * 85;
       // System.out.println("拟购买的价格是"+pirce);
        return pirce;
    }
}