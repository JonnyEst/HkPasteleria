package co.edu.utadeo.repository;

import co.edu.utadeo.domain.Company;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Integer> {
	public abstract ArrayList<Company> findByName(Integer name);
}
