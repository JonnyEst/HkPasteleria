package co.edu.utadeo.repository;

import co.edu.utadeo.domain.Stage;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StageRepository extends JpaRepository<Stage, Integer> {
	public abstract ArrayList<Stage> findByName(Integer name);

}
