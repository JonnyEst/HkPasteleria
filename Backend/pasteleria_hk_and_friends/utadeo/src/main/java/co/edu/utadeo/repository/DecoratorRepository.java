package co.edu.utadeo.repository;

import co.edu.utadeo.domain.Decorator;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DecoratorRepository extends JpaRepository<Decorator, Integer> {
	public abstract ArrayList<Decorator> findByName(Integer name);
}
