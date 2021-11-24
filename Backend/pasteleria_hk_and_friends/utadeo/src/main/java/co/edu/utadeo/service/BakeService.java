package co.edu.utadeo.service;

import co.edu.utadeo.domain.Bake;
import co.edu.utadeo.domain.Baker;
import co.edu.utadeo.domain.Country;
import co.edu.utadeo.repository.BakeRepository;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BakeService extends EntityService<Bake> {

	@Autowired
	BakeRepository bakeRepository;
    BakeService(BakeRepository repository) {
        super(repository);
    }
    
    public ArrayList<Bake> getBake() {
		return (ArrayList<Bake>) bakeRepository.findAll();
	}
 
    public Bake saveCountry(Bake bake) {
		return bakeRepository.save(bake);
	}
	
	
	public Optional<Bake> getForId(Integer id) {
		return bakeRepository.findById(id);
	}
	
	public boolean deleteBake(Integer id) {
		try {
			bakeRepository.deleteById(id);
			return true;
		}catch(Exception err) {
			return false;
		}
	} 
}
