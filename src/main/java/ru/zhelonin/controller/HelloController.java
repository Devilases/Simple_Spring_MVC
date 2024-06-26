package ru.zhelonin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController {

  @RequestMapping(method = RequestMethod.GET)
  public String printWelcome(ModelMap model) {
    String message = "Hello World, Spring 3.0!";
    System.out.println(message);
    model.addAttribute("message", "Spring 3 MVC - Hello World");
    return "hello";

  }
}
