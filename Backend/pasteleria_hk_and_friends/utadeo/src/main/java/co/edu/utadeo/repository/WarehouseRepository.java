package co.edu.utadeo.repository;

import co.edu.utadeo.domain.Warehouse;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WarehouseRepository extends JpaRepository<Warehouse, Integer> {
	public abstract ArrayList<Warehouse> findByName(Integer name);

}
