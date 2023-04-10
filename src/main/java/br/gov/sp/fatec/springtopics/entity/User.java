package br.gov.sp.fatec.springtopics.entity;

import javax.persistence.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

    @ManyToMany
    @JoinTable(name = "uau_user_authorization",
            joinColumns = {@JoinColumn(name = "usr_id")},
            inverseJoinColumns = {@JoinColumn(name = "aut_id")}
    )
    private List<Authorization> authorization;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Annotation> annotation;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User() {
        // Empty Constructor
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

    public List<Authorization> getAuthorization() {
        return authorization;
    }

    public void setAuthorization(List<Authorization> authorization) {
        this.authorization = authorization;
    }

    public List<Annotation> getAnnotation() {
        return annotation;
    }

    public void setAnnotation(List<Annotation> annotation) {
        this.annotation = annotation;
    }
}
