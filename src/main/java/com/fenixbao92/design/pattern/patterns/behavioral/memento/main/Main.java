package com.fenixbao92.design.pattern.patterns.behavioral.memento.main;

import com.fenixbao92.design.pattern.patterns.behavioral.memento.CareTaker;
import com.fenixbao92.design.pattern.patterns.behavioral.memento.Originator;

/**
 * Create by fenixbao92 on 2019/3/14.
 */
public class Main {

  public static void main(String[] args) {
    Originator originator = new Originator();
    CareTaker careTaker = new CareTaker();
    originator.setState("State #1");
    originator.setState("State #2");
    careTaker.add(originator.saveStateToMemento());
    originator.setState("State #3");
    careTaker.add(originator.saveStateToMemento());
    originator.setState("State #4");

    System.out.println("Current State: " + originator.getState());
    originator.getStateFromMemento(careTaker.get(0));
    System.out.println("First saved State: " + originator.getState());
    originator.getStateFromMemento(careTaker.get(1));
    System.out.println("Second saved State: " + originator.getState());
  }
}
