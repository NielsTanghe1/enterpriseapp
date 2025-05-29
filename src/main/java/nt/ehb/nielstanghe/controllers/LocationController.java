package nt.ehb.nielstanghe.controllers;

import nt.ehb.nielstanghe.models.DAOs.LocationDAO;
import nt.ehb.nielstanghe.models.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LocationController {
    private LocationDAO locationDAO;

//    @Autowired
//    public LocationController(LocationDAO locationDAO) {
//        this.locationDAO = locationDAO;
//    }
//
//    @PostMapping()
//    public void location(@RequestParam String name,
//                         @RequestParam String adress,
//                         @RequestParam int capacity){
//        Location newLocation = new Location();
//        newLocation.setName(name);
//        newLocation.setAddress(adress);
//        newLocation.setCapacity(capacity);
//        locationDAO.save(newLocation);
//    }
//
//    @GetMapping()
//    public Iterable<Werknemer> getWerknemers(){
//        return werknemerDAO.findAll();
//    }
//
//    @GetMapping("/id")
//    public Werknemer getById(@RequestParam int id){
//        return werknemerDAO.findWerknemerById(id);
//    }
//
//    @GetMapping("/name")
//    public Iterable<Werknemer> getByName(@RequestParam String name){
//        return werknemerDAO.findAllByName(name);
//    }
//
//    @DeleteMapping("/delete")
//    public String deleteWerknemerById(@RequestParam int id){
//        werknemerDAO.deleteById(id);
//        return "Deleted Werknemer";
//    }
}
