package co.edu.utadeo.repository;

import co.edu.utadeo.domain.Bake;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface BakeRepository extends JpaRepository<Bake, Integer> {
	
}
