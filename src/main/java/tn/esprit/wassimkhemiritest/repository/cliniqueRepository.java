package tn.esprit.wassimkhemiritest.repository;

import tn.esprit.wassimkhemiritest.entity.Clinique;
import tn.esprit.wassimkhemiritest.entity.Medecin;
import tn.esprit.wassimkhemiritest.service.ICliniqueService;
import tn.esprit.wassimkhemiritest.service.IMedecinService;

public class cliniqueRepsitory implements ICliniqueService {

    public Clinique addClinique(Clinique Clinique) {
        return cliniqueRepsitory.save(Clinique);
    }

    public static Clinique save(Clinique clinique) {
    }
}
