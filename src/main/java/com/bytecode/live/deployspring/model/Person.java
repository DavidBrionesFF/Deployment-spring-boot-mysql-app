package com.bytecode.live.deployspring.model;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "person")
public class Person {
    @GeneratedValue
    @Id
    private long id;

    @Column
    private String name;

    @Column
    private String username;

    @Column
    private Date date = new Date();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
