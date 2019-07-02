package com.coding;

import com.alibaba.fastjson.JSON;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.util.List;

/**
 * @author liyunze
 * @date 2019/6/28 11:28
 * @copyright Copyright © 2019 广电运通 All rights reserved.
 */
public class App {

    public static void main(String[] args) {

    }

    //解析
    @Test
    public void test1() {
        // 对象嵌套数组嵌套对象
        String json1 = "{'id':1,'name':'JAVAEE-1703','stus':[{'id':101,'name':'刘铭','age':16}]}";
        // 数组
        String json2 = "['北京','天津','杭州']";
        //1、
        //静态方法
        Grade grade= JSON.parseObject(json1, Grade.class);
        System.out.println(grade);
        //2、
        List<String> list=JSON.parseArray(json2, String.class);


        //3.字符串json解析成对象
        String json3 = "{'id':1,'name':'java','age':10}";
        Student student = JSON.parseObject(json3, Student.class);

        System.out.println(list);
    }
}
