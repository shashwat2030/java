package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class swEraController
{
    @RequestMapping("/")
public  String getIndexpage()
{
    return "index";
}
@RequestMapping("/savedata",method= RequestMethod.POST)
public ModelAndView sendData(@ModelAttribute Website website)
{
    ModelAndView modelAndView =new ModelAndView();
    modelAndView.setViewName("website-data");
    modelAndView.addObject("website",website);
    return modelAndView;
}
}
