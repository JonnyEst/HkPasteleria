package co.edu.utadeo.service;

import co.edu.utadeo.domain.TypeCake;
import co.edu.utadeo.repository.TypeCakeRepository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeCakeService extends EntityService<TypeCake>{

	@Autowired
	TypeCakeRepository typeCakeRepository;
    TypeCakeService(TypeCakeRepository repository) {
        super(repository);
    }

    public ArrayList<TypeCake> getTypeCake() {
		return (ArrayList<TypeCake>) typeCakeRepository.findAll();
	}
	
	public TypeCake saveTypeCake(TypeCake typeCake) {
		return typeCakeRepository.save(typeCake);
	}
	
	@Override
	public void getForId(int id) {
	 typeCakeRepository.findById(id);
	}
	
	public ArrayList<TypeCake> getForName(int name) {
		return typeCakeRepository.findByName(name);
	}
	
	
	@Override
	public void delete(int id) {
		typeCakeRepository.deleteById(id);
	}
	
    
    
}
