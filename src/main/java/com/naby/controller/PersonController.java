package com.naby.controller;

import com.naby.service.PersonService;
import com.naby.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping("/save.do")
    public String save(@ModelAttribute Person person) {
        personService.save(person);
        return "redirect:/person/findAll.do";
    }

    @RequestMapping("/update.do")
    public String update(@ModelAttribute Person person) {
        personService.update(person);
        return "redirect:/person/findAll.do";
    }

    @RequestMapping("/delete.do")
    public String delete(@ModelAttribute Person person) {
        personService.delete(person);
        return "redirect:/person/findAll.do";
    }

    @RequestMapping("/findOne.do")
    public String findOne(HttpServletRequest request, @ModelAttribute Person person) {
        request.setAttribute("x", personService.findOne(person));
        return "person/index";
    }

    @RequestMapping("/findAll.do")
    public String findAll(HttpServletRequest request) {
        request.setAttribute("list", personService.findAll());
        return "person/index";
    }
}