package com.jsframe.loginpage.controller;

import com.jsframe.loginpage.service.Service;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
@Log
public class Controller {

    @Autowired
    private Service serv;

    @GetMapping("/")
    public String home(){
        log.info("home()");
        return "home";
    }

    @GetMapping("join")
    public String join(){
        log.info("join()");
        return "join";
    }


}
