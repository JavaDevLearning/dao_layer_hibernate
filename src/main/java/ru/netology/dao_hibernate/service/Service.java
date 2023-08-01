package ru.netology.dao_hibernate.service;

import ru.netology.dao_hibernate.entityPerson.EntityPerson;
import ru.netology.dao_hibernate.repository.Repository;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    private final Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public List<EntityPerson> getPersonByCity(String city) {
        return repository.getPersonByCity(city);
    }
}
