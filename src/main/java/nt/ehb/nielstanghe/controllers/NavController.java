package nt.ehb.nielstanghe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {
    @GetMapping(value = {"/about"})
    public String about(ModelMap map) {
        return "about";
    }

    @GetMapping(value = {"/new"})
    public String newevent(ModelMap map) {
        return "new";
    }
}