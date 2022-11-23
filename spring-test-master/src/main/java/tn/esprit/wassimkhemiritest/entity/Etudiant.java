package tn.esprit.wassimkhemiritest.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import tn.esprit.wassimkhemiritest.entity.Enum.Option;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor

@Table(name="Etudiant")
//c'est une annotation  lombok qui crée constructerur, getter , setter, hash, to string... !!!!! non recommandé parcequ'on a des associations
//@Data



@NoArgsConstructor

public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="idEtudiant")
    private Long idEtudiant; // Clé primaire
    private String prenomE;
    private String nomE;
    @Enumerated(EnumType.STRING)
    private Option opt;


}
