package co.com.udea.plandeestudio.data.repository;

import co.com.udea.plandeestudio.data.entity.FacultadEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FacultadRepository extends JpaRepository<FacultadEntity, Long> {
}
