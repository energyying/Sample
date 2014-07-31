package com.energyying.sample;

/**
 * Created by DEV001 on 2014/7/31.
 */
public class SampleRunning {

    public int getInt(Long id){
        if(id!=null){
            return id.intValue();
        }else{
            return 0;
        }
    }

}
