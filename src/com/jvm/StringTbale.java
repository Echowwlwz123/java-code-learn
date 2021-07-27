package com.jvm;

public class StringTbale {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";
        String s3 = "a" + "b";//ab
        String s4 = s1 + s2;//new String("ab")
        String s5 = "ab";
        String s6 = s4.intern();//如果常量池中没有则把s4入池，如果有则不入池，返回常量池中的内容

        System.out.println(s3 == s4);//false,stringTable中的常量“ab”跟new String对象做比较
        System.out.println(s3 == s5);//true，stringTable中的常量做比较
        System.out.println(s3 == s6);//

        String x2 = new String("C") + new String("D");//new String("CD")
        String x1 = "CD";//CD
        x2.intern();
        System.out.println(x1 == x2);//false
        //如果调换位置则为true，如果是jdk1.6版本的话则为false，x2入池的是x2的副本


    }

}
