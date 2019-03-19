package com.fenixbao92.design.pattern.patterns.j2ee.frontcontroller;

/**
 * Create by fenixbao92 on 2019/3/19.
 */
public class Dispatcher {
    private StudentView studentView;
    private HomeView homeView;
    public Dispatcher(){
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request){
        if(request.equalsIgnoreCase("STUDENT")){
            studentView.show();
        }else{
            homeView.show();
        }
    }
}
