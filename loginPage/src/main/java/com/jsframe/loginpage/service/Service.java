package com.jsframe.loginpage.service;

import com.jsframe.loginpage.entity.Member;
import com.jsframe.loginpage.repository.MemberRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Service
@Log
public class Service {

    @Autowired
    MemberRepository mRepo;

    public String joinProd(Member member) {

        String view = null;

        try {
            mRepo.save(member);
            view = "redirect:/";
        } catch (Exception e){
            view = "redirect:join";
        }

        return view;
    }
}
