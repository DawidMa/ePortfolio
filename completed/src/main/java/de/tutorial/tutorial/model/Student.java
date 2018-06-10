package de.tutorial.tutorial.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String phone;
    private boolean matriculated;

    public Student(String name, String phone, boolean matriculated) {
        this.name = name;
        this.phone = phone;
        this.matriculated = matriculated;
    }

    protected Student(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isMatriculated() {
        return matriculated;
    }

    public void setMatriculated(boolean matriculated) {
        this.matriculated = matriculated;
    }
}
