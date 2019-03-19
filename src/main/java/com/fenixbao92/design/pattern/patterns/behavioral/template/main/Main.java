package com.fenixbao92.design.pattern.patterns.behavioral.template.main;

import com.fenixbao92.design.pattern.patterns.behavioral.template.Cricket;
import com.fenixbao92.design.pattern.patterns.behavioral.template.Football;
import com.fenixbao92.design.pattern.patterns.behavioral.template.Game;

/**
 * Create by fenixbao92 on 2019/3/14.
 */
public class Main {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }

}
