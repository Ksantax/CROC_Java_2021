package com.company;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Seller {
    private int id;
    private String name, surname;

    protected Seller() {}

    public Seller(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }

    public void setSurname(String surname) { this.surname = surname; }
}
