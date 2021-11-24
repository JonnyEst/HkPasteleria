package co.edu.utadeo.repository;

import co.edu.utadeo.domain.TypeCake;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeCakeRepository extends JpaRepository<TypeCake, Integer> {
	public abstract ArrayList<TypeCake> findByName(Integer name);
}
