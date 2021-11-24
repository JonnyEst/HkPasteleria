package co.edu.utadeo.repository;

import co.edu.utadeo.domain.Country;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {
	public abstract ArrayList<Country> findByName(Integer name);
}
