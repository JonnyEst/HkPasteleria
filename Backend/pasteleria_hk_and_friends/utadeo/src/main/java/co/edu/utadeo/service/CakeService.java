package co.edu.utadeo.service;

import co.edu.utadeo.domain.Cake;
import co.edu.utadeo.repository.CakeRepository;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CakeService extends EntityService<Cake> {

	@Autowired
	CakeRepository cakeRepository;
    CakeService(CakeRepository repository) {
        super(repository);
    }
    
    public ArrayList<Cake> getCake() {
		return (ArrayList<Cake>) cakeRepository.findAll();
	}
	
	public Cake saveCake(Cake cake) {
		return cakeRepository.save(cake);
	}
	
	public Optional<Cake> getForId(Integer id) {
		return cakeRepository.findById(id);
	}
	
	public boolean deleteCake(Integer id) {
		try {
			cakeRepository.deleteById(id);
			return true;
		}catch(Exception err) {
			return false;
		}
	} 
    
}
