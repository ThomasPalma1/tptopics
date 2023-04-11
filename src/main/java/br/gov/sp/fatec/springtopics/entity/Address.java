package br.gov.sp.fatec.springtopics.entity;


import javax.persistence.*;

@Entity
@Table(name = "add_address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "add_id")
    private Long id;


    @Column(name = "public_place")
    private String publicPlace;


    @Column(name = "house_number")
    private Integer houseNumber;


    @Column(name = "complement")
    private String complement;


    @Column(name = "neighborhood")
    private String neighborhood;


    @Column(name = "city")
    private String city;


    @Column(name = "state")
    private String state;


    @Column(name = "zip_code")
    private Integer zipCode;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "add_usr_id")
    private User user;

    public Address() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPublicPlace() {
        return publicPlace;
    }

    public void setPublicPlace(String publicPlace) {
        this.publicPlace = publicPlace;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
