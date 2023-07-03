package org.acme;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Cacheable
public class Fruit extends PanacheEntityBase {
    @Id
    @Column(unique = true)
    public int id;
    @Column(length = 40, unique = true)
    public String name;

    public Fruit() {
    }

    public Fruit(String name) {
        this.name = name;
    }

}