package nt.ehb.nielstanghe.controllers;


import nt.ehb.nielstanghe.models.Event;
import nt.ehb.nielstanghe.models.DAOs.EventDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class DetailsController {

    EventDAO repo;

    @Autowired
    public DetailsController(EventDAO repo) {
        this.repo = repo;
    }

    @RequestMapping(value = "/details/{id}", method = RequestMethod.GET)
    public String showDetailsForID(ModelMap map, @PathVariable(value = "id") int id) {
        Optional<Event> optional = repo.findById(id);
        if (optional.isPresent()) {
            map.addAttribute("event", optional.get());
            return "details";
        }
        return "redirect:/index";
    }
}