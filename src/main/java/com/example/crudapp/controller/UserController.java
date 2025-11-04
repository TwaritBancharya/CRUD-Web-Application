package com.example.crudapp.controller;

import com.example.crudapp.entity.User;
import com.example.crudapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("users", service.listAll());
        return "index";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("user", new User());
        return "add";
    }

    @PostMapping("/save")
    public String saveUser(@ModelAttribute("user") User user) {
        service.save(user);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model) {
        User existing = service.get(id);
        model.addAttribute("user", existing);
        return "edit";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        service.delete(id);
        return "redirect:/";
    }
}
