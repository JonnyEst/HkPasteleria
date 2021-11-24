package co.edu.utadeo.service;

import co.edu.utadeo.domain.Decorator;
import co.edu.utadeo.repository.DecoratorRepository;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DecoratorService extends EntityService<Decorator> {

	@Autowired
	DecoratorRepository decoratorRepository;
    DecoratorService(DecoratorRepository repository) {
        super(repository);
    }
    	
    public ArrayList<Decorator> getDecorator() {
		return (ArrayList<Decorator>) decoratorRepository.findAll();
	}
	
	public Decorator saveDecorator(Decorator decorator) {
		return decoratorRepository.save(decorator);
	}
	
	public Optional<Decorator> getForId(Integer id) {
		return decoratorRepository.findById(id);
	}
	
	public ArrayList<Decorator> getForName(Integer name) {
		return decoratorRepository.findByName(name);
	}
	
	public boolean deleteDecorator(Integer id) {
		try {
			decoratorRepository.deleteById(id);
			return true;
		}catch(Exception err) {
			return false;
		}
	} 
    
}
