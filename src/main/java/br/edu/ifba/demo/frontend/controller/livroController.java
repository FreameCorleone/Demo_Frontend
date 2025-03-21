package br.edu.ifba.demo.frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class livroController {
    @Autowired

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }
    
    @GetMapping("/dashboard")
    public ModelAndView index1() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("dashboard");
        return mv;
    }

    @GetMapping("/cadastrodecontas")
    public ModelAndView index2() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("cadastrodecontas");
        return mv;
    }

    @GetMapping("/perfil")
    public ModelAndView index3() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("perfil");
        return mv;
    }

    @GetMapping("/cadastro")
    public ModelAndView index4() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("cadastro");
        return mv;
    }
}
