package tn.esprit.wassimkhemiritest.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import tn.esprit.wassimkhemiritest.entity.Enum.Specialite;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.Set;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table( name = "Medcin")
@Transactional
public class Medecin implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long idMedcin;
    private String nomMedcin;
    private int telephone;
    private int PrixConsultation;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;

    @JsonIgnore
    @ManyToMany(mappedBy = "Medecin",cascade = CascadeType.ALL)
    private Set<Clinique> cliniques;

    @JsonIgnore
    @OneToMany(mappedBy = "Medecin",cascade = CascadeType.ALL)
    private Set<Rendezvous> rendezvous;

}
