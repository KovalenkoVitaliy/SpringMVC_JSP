package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/emp1")
public class MyController1 {

    @RequestMapping("/")
    public String showFirstView(){
        return "first-view1";
    }

    @RequestMapping("/askDetails1")
    public String askEmployeeDetails(Model model){
        model.addAttribute("employee", new Employee());
        return  "ask-emp-details-view1";
    }


    @RequestMapping("/showDetails1")
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "ask-emp-details-view1";
        } else {
            return "show-emp-details-view1";
        }
    }
}
