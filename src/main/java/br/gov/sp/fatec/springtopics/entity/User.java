package br.gov.sp.fatec.springtopics.entity;

import javax.persistence.*;

@Entity // this class will map a table
@Table(name = "usr_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usr_id")
    private Long id;

    @Column(name = "usr_name")
    private String name;

    @Column(name = "usr_password")
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User() {
        //Do nothing
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
