package ru.netology.dao_hibernate.entityPerson;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter

public class EntityPersonPK implements Serializable {
    private String name;
    private String surname;
    private int age;
}
