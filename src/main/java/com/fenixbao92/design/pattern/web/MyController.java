package com.fenixbao92.design.pattern.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Create by fenixbao92 on 2019/3/13.
 */
@Controller
public class MyController {

    @RequestMapping(value = "/hello", method = {RequestMethod.GET})
    @ResponseBody
    public String hello(){
        return "hello";
    }

}
