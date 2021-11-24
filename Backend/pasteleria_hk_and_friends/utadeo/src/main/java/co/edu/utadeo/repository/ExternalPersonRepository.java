package co.edu.utadeo.repository;

import co.edu.utadeo.domain.ExternalPerson;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExternalPersonRepository extends JpaRepository<ExternalPerson, Integer> {
	public abstract ArrayList<ExternalPerson> findByName(Integer name);

}
