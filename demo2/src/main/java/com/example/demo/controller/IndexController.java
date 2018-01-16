package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/in")
public class IndexController {

    @RequestMapping("/aa")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("my","6666");
            return mv;
    }
}
