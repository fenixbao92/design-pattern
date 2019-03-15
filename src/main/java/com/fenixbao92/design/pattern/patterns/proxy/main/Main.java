package com.fenixbao92.design.pattern.patterns.proxy.main;

import com.fenixbao92.design.pattern.patterns.proxy.Image;
import com.fenixbao92.design.pattern.patterns.proxy.ProxyImage;

/**
 * Create by fenixbao92 on 2019/3/14.
 */
public class Main {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }

}
