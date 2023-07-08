package com.naby.controller;

import com.naby.model.service.PersonService;
import com.naby.model.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/list-persons", method = RequestMethod.GET)
    public String findAll(HttpServletRequest request) {
        request.setAttribute("list", personService.findAll());
        return "list-persons";
    }

    @RequestMapping(value = "/add-person", method = RequestMethod.GET)
    public String add() {
        return "add-person";
    }

    @RequestMapping(value = "/add-person/save", method = RequestMethod.GET)
    public String save(@ModelAttribute Person person) {
        personService.save(person);
        return "redirect:/list-persons";
    }

    @RequestMapping(value = "/add-person/update", method = RequestMethod.GET)
    public String update(@ModelAttribute Person person) {
        personService.update(person);
        return "redirect:/list-persons";
    }

    @RequestMapping(value = "/add-person/delete", method = RequestMethod.GET)
    public String delete(@ModelAttribute Person person) {
        personService.delete(person);
        return "redirect:/list-persons";
    }
}