package co.edu.utadeo.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.utadeo.domain.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer>{
	//public abstract ArrayList<Empleado> findByName(Integer name);
}
