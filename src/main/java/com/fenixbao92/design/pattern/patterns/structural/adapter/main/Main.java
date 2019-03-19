package com.fenixbao92.design.pattern.patterns.structural.adapter.main;

import com.fenixbao92.design.pattern.patterns.structural.adapter.MediaAdapter;
import com.fenixbao92.design.pattern.patterns.structural.adapter.MediaPlayer;

/**
 * Create by fenixbao92 on 2019/3/14.
 */
public class Main {

    public static void main(String[] args){

        //like proxy pattern
        MediaAdapter  mediaAdapter = new MediaAdapter("mp4");
        mediaAdapter.play("mp4","beyond the horizon.mp3");

        //another way
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");

    }

    //public class AudioPlayer implements MediaPlayer only can be written in another file
    //这里是双层代理 在mediaAdapter代理了AdvancedMediaPlayer基础上AudioPlayer代理了mediaAdapter
    public static class AudioPlayer implements MediaPlayer {
        MediaAdapter mediaAdapter;

        @Override
        public void play(String audioType, String fileName) {

            //播放 mp3 音乐文件的内置支持
            if(audioType.equalsIgnoreCase("mp3")){
                System.out.println("Playing mp3 file. Name: "+ fileName);
            }
            //mediaAdapter 提供了播放其他文件格式的支持
            else if(audioType.equalsIgnoreCase("vlc")
                    || audioType.equalsIgnoreCase("mp4")){
                mediaAdapter = new MediaAdapter(audioType);
                mediaAdapter.play(audioType, fileName);
            }
            else{
                System.out.println("Invalid media. "+
                        audioType + " format not supported");
            }
        }
    }

}

