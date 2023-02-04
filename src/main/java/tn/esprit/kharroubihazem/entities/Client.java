package tn.esprit.kharroubihazem.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "imc")
    private Imc imc;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "nom")
    private String nom;

    @JsonIgnore
    @OneToMany(mappedBy = "client")
    private List<Plat> plats = new ArrayList<>();



}