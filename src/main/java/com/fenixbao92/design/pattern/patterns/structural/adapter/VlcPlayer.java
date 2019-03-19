package com.fenixbao92.design.pattern.patterns.structural.adapter;

/**
 * Create by fenixbao92 on 2019/3/15.
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
