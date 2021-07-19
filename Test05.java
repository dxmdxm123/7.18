package com.du.lianxi03;

import java.util.ArrayList;

/**
 * 创建一个List集合，并添加元素0-9
 * 将集合转换为一个Integer数组并输出数组每一个元素
 * @author Xiloer
 *
 */
public class Test05 {
    public static void main(String[] args) {
        //创建一个List集合创建一个List集合，并添加元素0-9
       ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add(1);
        }
        System.out.println("list = " + list);
        ArrayList<Integer> alist = new ArrayList<Integer>();
           alist.add(1);
           alist.add(2);
           alist.add(3);
           alist.add(4);
           alist.add(5);
           alist.add(6);
           alist.add(7);
           alist.add(8);
           alist.add(9);
        System.out.println("alist = " + alist);
        }

    }

