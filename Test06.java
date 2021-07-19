package com.du.lianxi03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 创建一个字符串数组:{"one","two","three"}
 * 然后将该数组转换为一个List集合
 * @author Xiloer
 *
 */
public class Test06 {
    public static void main(String[] args) {
        //创建一个字符串数组:{"one","two","three"}
        String[] a ={"one","two","three"};
        //然后将该数组转换为一个List集合
        List<String> list = Arrays.asList(a);
        System.out.println(list);
        List<String> list1 = new  ArrayList<String >(list);
        System.out.println("list1 = " + list1);

    }
}
