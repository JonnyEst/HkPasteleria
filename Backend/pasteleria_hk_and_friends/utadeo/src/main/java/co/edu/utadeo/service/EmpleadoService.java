package co.edu.utadeo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.utadeo.domain.Empleado;
import co.edu.utadeo.repository.EmpleadoRepository;

@Service
public class EmpleadoService extends EntityService<Empleado>{
	 
	@Autowired
	private EmpleadoRepository repository;
	EmpleadoService(EmpleadoRepository repository) {
		super(repository);
	}
	
	
	public List<Empleado> getEmpleado(){
		return repository.findAll();
	}
	
	public Empleado guardarEmpleado(Empleado empleado) {
		return repository.save(empleado);
	}
	
	@Override
	public void getForId(int id) {
		repository.findById(id);
	}
	
	@Override
	public void delete(int id) {
		repository.deleteById(id);
	}
	
}
