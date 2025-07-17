package com.enrique.curso.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.enrique.curso.springboot.webapp.springboot_web.models.User;


@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Enrique", "Munoz");

        model.addAttribute("title", "Hola Mundo Spring Boot");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model){
        model.addAttribute("title", "Listado de usuarios");
        return "list";
    }

    @ModelAttribute("users")
    public List<User> usersModel(){

        return Arrays.asList(
            new User("pepa", "Gonzalez"),
            new User("lalo", "Perez"),
            new User("Juanita", "Roe", "juanita@gmail.com"),
            new User("Andres", "Doe"));

    }
}
