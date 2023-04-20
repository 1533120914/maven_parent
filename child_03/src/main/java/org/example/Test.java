package org.example;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
    String json=Child01.ToJSON(Arrays.asList(new String[]{"张飞","关羽"}));
        System.out.println(json);
    }
}