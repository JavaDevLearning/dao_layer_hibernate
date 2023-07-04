package ru.netology.dao_hibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.Arrays;
import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {
    @PersistenceContext
    private EntityManager entityManager;

    public List getPersonByCity(String city){

        List result = entityManager.createNativeQuery("SELECT * FROM persons WHERE city_of_living ILIKE :city").setParameter("city", city).getResultList();

        System.out.println(Arrays.deepToString(result.toArray()));
        return result;
    }
}
