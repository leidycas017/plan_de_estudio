package co.com.udea.plandeestudio.rest.falcultadres;

import co.com.udea.plandeestudio.domain.model.Facultad;
import co.com.udea.plandeestudio.domain.service.facultad.FacultadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(FacultadRest.URL_FACULTAD)
public class FacultadRest {
    private final FacultadService service;
    public static final String URL_FACULTAD = "facultad";

    @Autowired
    public FacultadRest (FacultadService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Facultad> getByIdFacultad(@PathVariable Long id) {
        return new ResponseEntity<>(service.getByIdFacultad(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Facultad>> getAllFacultades() {
        return new ResponseEntity<>(service.getAllFacultad(), HttpStatus.OK);
    }
}
