package co.com.udea.plandeestudio.domain.service.facultad;

import co.com.udea.plandeestudio.domain.model.Facultad;
import co.com.udea.plandeestudio.domain.outputport.Persistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FacultadService {

    private final Persistence persistence;


    @Autowired
    public FacultadService(Persistence persistence) {
        this.persistence = persistence;
    }

    public Facultad getByIdFacultad(Long id) {
        return persistence.getFacultadById(id).orElse(new Facultad()); //TODO: controlar error NotFountException
    }

    public List<Facultad> getAllFacultad() {
        return persistence.getAllFacultad().orElse(new ArrayList<>());
    }
}
