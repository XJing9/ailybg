package com.aaa.util;

public class Test01 {
    public static void main(String[] args) {
        String s="1,2,3,4,5";
        String[] s1=s.split(",");
        for (String a:s1){
            System.out.println(a);
        }
    }
}
