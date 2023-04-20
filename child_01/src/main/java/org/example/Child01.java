package org.example;

import com.alibaba.fastjson.JSON;

public class Child01 {
    public static String ToJSON(Object obj){
        return JSON.toJSONString(obj);
    }
}
