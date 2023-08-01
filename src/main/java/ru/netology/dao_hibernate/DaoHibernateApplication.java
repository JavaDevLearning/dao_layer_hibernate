package ru.netology.dao_hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DaoHibernateApplication {
    public static void main(String[] args) {

        SpringApplication.run(DaoHibernateApplication.class, args);
    }

}
