package br.gov.sp.fatec.springtopics.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ant_annotation")
public class Annotation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ant_id")
    private Long id;

    @Column(name = "ant_text")
    private String text;

    @Column(name = "ant_datetime")
    private LocalDateTime datetime;


    @ManyToOne
    @JoinColumn(name = "ant_usr_id")
    private User user;

}
