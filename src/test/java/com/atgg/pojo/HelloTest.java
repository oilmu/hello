package com.atgg.pojo;

import org.junit.Test;

public class HelloTest {
    @Test
    public void test1(){
        Hello hello = new Hello();
            String results = hello.sayHello("litingwei");
            System.out.println(results);
    }
}
