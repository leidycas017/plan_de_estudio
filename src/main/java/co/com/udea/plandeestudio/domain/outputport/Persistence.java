package co.com.udea.plandeestudio.domain.outputport;

import co.com.udea.plandeestudio.domain.model.Facultad;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface Persistence {

    Optional<Facultad> getFacultadById(Long id);
    Optional<List<Facultad>> getAllFacultad();
}
