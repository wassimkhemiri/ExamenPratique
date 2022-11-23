package tn.esprit.wassimkhemiritest.service;

import tn.esprit.wassimkhemiritest.entity.Medecin;
import tn.esprit.wassimkhemiritest.repository.medecinRepsitory;

public class MedecinServiceImp implements IMedecinService{

    medecinRepsitory Medecinepository;
    public Medecin addMedecin(Medecin Medecin) {
        return medecinRepsitory.save(Medecin);
    }





}
