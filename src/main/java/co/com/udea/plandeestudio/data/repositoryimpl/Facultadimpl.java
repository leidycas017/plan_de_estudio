package co.com.udea.plandeestudio.data.repositoryimpl;

import co.com.udea.plandeestudio.data.repository.FacultadRepository;
import co.com.udea.plandeestudio.domain.model.Facultad;
import co.com.udea.plandeestudio.domain.outputport.Persistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class Facultadimpl implements Persistence {

    private final FacultadRepository repository;

    @Autowired
    public Facultadimpl (FacultadRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Facultad> getFacultadById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Optional<List<Facultad>> getAllFacultad() {
        return repository.findAll();
    }
}
