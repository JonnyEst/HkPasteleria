package co.edu.utadeo.service;

import co.edu.utadeo.domain.Decor;
import co.edu.utadeo.repository.DecorRepository;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DecorService extends EntityService<Decor>{

	@Autowired
	DecorRepository decorRepository;
    DecorService(DecorRepository repository) {
        super(repository);
    }
    
    public ArrayList<Decor> getDecor() {
		return (ArrayList<Decor>) decorRepository.findAll();
	}
	
	public Decor saveDecor(Decor decor) {
		return decorRepository.save(decor);
	}
	
	public Optional<Decor> getForId(Integer id) {
		return decorRepository.findById(id);
	}
	
	public boolean deleteDecor(Integer id) {
		try {
			decorRepository.deleteById(id);
			return true;
		}catch(Exception err) {
			return false;
		}
	} 
}
