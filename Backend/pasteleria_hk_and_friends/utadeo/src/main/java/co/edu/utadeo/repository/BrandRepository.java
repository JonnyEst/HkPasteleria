package co.edu.utadeo.repository;

import co.edu.utadeo.domain.Brand;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Integer> {
	public abstract ArrayList<Brand> findByName(Integer name);
}
