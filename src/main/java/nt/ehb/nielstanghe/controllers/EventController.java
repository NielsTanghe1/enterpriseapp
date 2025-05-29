
package nt.ehb.nielstanghe.controllers;

import nt.ehb.nielstanghe.models.DAOs.EventDAO;
import nt.ehb.nielstanghe.models.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.validation.*;

@Controller
public class EventController {

    private EventDAO repo;

    @Autowired
    public EventController(EventDAO repo) {
        this.repo = repo;
    }

    @ModelAttribute("all")
    public Iterable<Event> findAll(){
        return repo.findAll();
    }

    @RequestMapping(value = {"/index", "/"}, method = RequestMethod.GET)
    public String showIndex(ModelMap map){
        return "index";
    }

    @ModelAttribute("new_event")
    public Event createNew(){
        return new Event();
    }

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.POST)
    public String saveEvent(@ModelAttribute("new_event") @Valid Event newEvent, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            //er was een fout in het formulier, toon deze pagina opnieuw
            return "index";
        }
        repo.save(newEvent);
        //redirect = verwijzen naar andere request, default een get
        return "redirect:/index";
    }

}
