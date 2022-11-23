package tn.esprit.wassimkhemiritest.service;

import tn.esprit.wassimkhemiritest.entity.Clinique;
import tn.esprit.wassimkhemiritest.entity.Medecin;
import tn.esprit.wassimkhemiritest.repository.CliniqueRepsitory;
import tn.esprit.wassimkhemiritest.repository.medecinRepsitory;

public class CliniqueServiceImp implements ICliniqueService{

    medecinRepsitory Cliniquepository;
    public Clinique addClinique(Clinique Clinique) {
        return CliniqueRepsitory.save(Clinique);
    }





}
