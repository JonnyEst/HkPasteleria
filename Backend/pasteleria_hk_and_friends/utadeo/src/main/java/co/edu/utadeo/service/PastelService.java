package co.edu.utadeo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.utadeo.domain.Pastel;
import co.edu.utadeo.repository.PastelRepository;

@Service
public class PastelService extends EntityService<Pastel> {
	
	@Autowired
	private PastelRepository repository;
	PastelService(PastelRepository repository) {
		super(repository);
	}

	public List<Pastel> getPastel() {
		return repository.findAll();
	}
	
	public Pastel guardarPastel(Pastel pastel) {
		return repository.save(pastel);
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
