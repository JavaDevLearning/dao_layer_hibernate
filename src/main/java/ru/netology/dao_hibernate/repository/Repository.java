package ru.netology.dao_hibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import ru.netology.dao_hibernate.entityPerson.EntityPerson;

import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<EntityPerson> getPersonByCity(String city) {
        return entityManager.createQuery("SELECT p FROM EntityPerson p WHERE p.cityOfLiving = :city")
                .setParameter("city", city).getResultList();
    }
}
