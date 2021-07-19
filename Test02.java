package com.du.lianxi03;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 创建一个集合，存放元素"1","$","2","$","3","$","4"
 *   使用迭代器遍历集合，并在过程中删除所有的"$"，
 *   最后再将删除元素后的集合使用新循环遍历，并输出每一个元素。
 * @author Xiloer
 *
 */
public class Test02 {
    public static void main(String[] args) {
        //创建一个集合，存放元素"1","$","2","$","3","$","4"
       ArrayList<String> aa = new ArrayList<>();
       aa.add("1");
       aa.add("$");
       aa.add("2");
       aa.add("$");
       aa.add("3");
       aa.add("$");
       aa.add("4");
       System.out.println("aa = " + aa);
        //使用迭代器遍历集合，并在过程中删除所有的"$"，
        Iterator<String> c = aa.iterator();
        while (c.hasNext()){
            if ("&".equals(c.next())){
                c.remove();
            }

        }
         //最后再将删除元素后的集合使用新循环遍历，并输出每一个元素。
        System.out.println("aa = " + aa);
    }


}
