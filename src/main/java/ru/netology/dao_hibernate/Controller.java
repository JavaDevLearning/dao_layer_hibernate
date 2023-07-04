package ru.netology.dao_hibernate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    private final Repository repository;

    public Controller(Repository repository){
        this.repository = repository;
    }

    @GetMapping("/persons/by-city")
    @ResponseBody
    public List getUserName(@RequestParam("city") String city){
        return repository.getPersonByCity(city);
    }
}
