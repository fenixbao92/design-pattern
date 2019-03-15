package com.fenixbao92.design.pattern.patterns.adapter;

/**
 * Create by fenixbao92 on 2019/3/15.
 */
public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
