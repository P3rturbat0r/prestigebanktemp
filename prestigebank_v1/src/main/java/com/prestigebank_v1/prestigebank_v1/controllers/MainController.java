package com.prestigebank_v1.prestigebank_v1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @GetMapping("/")
    //public ModelAndView getIndex() {
    //ModelAndView getIndexPage = new ModelAndView("index");
   // getIndexPage.addObject("PageTitle", "index");
   //     System.out.println("in index Controller");
    //    return getIndexPage;
   // }

    public String greeting(Model model){
        model.addAttribute("greeting", "Hello World!");
        return "index";
    }
}
