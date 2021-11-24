package co.edu.utadeo.repository;

import co.edu.utadeo.domain.Baker;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BakerRepository extends JpaRepository<Baker, Integer> {
	public abstract ArrayList<Baker> findByName(Integer name);
}
