package com.test.controller;

import com.sun.xml.internal.ws.policy.sourcemodel.ModelNode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")

    public ModelAndView helloWorld()
    {
        return new
                ModelAndView("welcome","message","Hello World");

    }
/*
    @RequestMapping("welcome")

    public ModelAndView helloWorld2()
    {
        return new
                ModelAndView("welcome2","message","Hello World2");

    }
*/
    @RequestMapping("welcome")
    public ModelAndView processFormMethod(@RequestParam("FName") String fName,
                                          @RequestParam("Password") String lName){

        String message =  "Welcome, " + fName + "!";
            return new
                ModelAndView("welcome2","message",message);

    }

    @RequestMapping("register")
    public ModelAndView registerMethod() {
        return new
                ModelAndView("registrationPage","registerMessage","Register");



    }




}
