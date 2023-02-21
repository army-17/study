package com.jsframe.loginpage.controller;

import com.jsframe.loginpage.entity.Member;
import com.jsframe.loginpage.service.Service;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
@Log
public class Controller {

    ModelAndView mv;

    @Autowired
    private Service serv;

    //메인페이지
    @GetMapping("/")
    public String home(){
        log.info("home()");
        return "home";
    }

    //회원가입페이지 이동
    @GetMapping("join")
    public String join(){
        log.info("join()");
        return "join";
    }

    //회워가입 기능
    @PostMapping("joinProd")
    public String joinProd(Member member){
        log.info("joinPord()");
        String view = serv.joinProd(member);
        return view;
    }




}
