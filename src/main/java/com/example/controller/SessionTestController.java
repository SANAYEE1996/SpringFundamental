package com.example.controller;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
@Controller
public class SessionTestController {
    @RequestMapping(value = "/order1")
    public String test1(HttpSession session) throws Exception {
        Integer ordercnt=(Integer)session.getAttribute("ordercnt");
        if ( ordercnt !=null ){
            ordercnt += 1 ;
        }
        else {
            ordercnt = 0 ;
        }
        session.setAttribute("ordercnt", ordercnt) ;
        return "order";
    }
    // 위와 아래 예제 동일
    @RequestMapping(value = "/order2")
    public String test2(@SessionAttribute("ordercnt") Integer ordercnt,HttpSession session) throws Exception {
        if ( ordercnt !=null ){
            ordercnt += 1 ;
        }
        else {
            ordercnt = 0 ;
        }
        session.setAttribute("ordercnt", ordercnt);
        return "order";
    }
}
