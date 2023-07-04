package ru.netology.dao_hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DaoHibernateApplication  implements CommandLineRunner {
@PersistenceContext
    EntityManager entityManager;

    public static void main(String[] args) {

        SpringApplication.run(DaoHibernateApplication.class, args);
    }

    @Transactional
    @Override
    public void run(String... args) throws Exception{
        EntityPerson roma = new EntityPerson();
        roma.setName("Roma");
        roma.setSurname("Ivanov");
        roma.setAge(28);
        roma.setPhone_number("3242");
        roma.setCity_of_living("Moscow");
        entityManager.persist(roma);

        EntityPerson ivan = new EntityPerson();
        ivan.setName("Ivan");
        ivan.setSurname("Sokolov");
        ivan.setAge(34);
        ivan.setPhone_number("5626");
        ivan.setCity_of_living("Ufa");
        entityManager.persist(ivan);


    }

}
