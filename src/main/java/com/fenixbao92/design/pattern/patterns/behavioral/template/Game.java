package com.fenixbao92.design.pattern.patterns.behavioral.template;

/**
 * Create by fenixbao92 on 2019/3/19.
 */
public abstract class Game {
    //模板
    public final void play(){

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

}
