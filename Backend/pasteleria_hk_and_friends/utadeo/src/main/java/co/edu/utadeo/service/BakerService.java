package co.edu.utadeo.service;

import co.edu.utadeo.domain.Bake;
import co.edu.utadeo.domain.Baker;
import co.edu.utadeo.repository.BakeRepository;
import co.edu.utadeo.repository.BakerRepository;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class BakerService extends EntityService<Baker>{
 
	@Autowired
	BakerRepository bakerRepository;
    BakerService(BakeRepository repository) {
        super(repository);
    }
	
	public ArrayList<Baker> getPastryChef() {
		return (ArrayList<Baker>) bakerRepository.findAll();
	}
	
	/*public Baker savePastryChef(Baker baker) {
		return bakerRepository.save(baker);
	}*/
	
	public Optional<Baker> getForId(Integer id) {
		return bakerRepository.findById(id);
	}
	
	public ArrayList<Baker> getForName(Integer name) {
		return bakerRepository.findByName(name);
	}
	
	public Baker save(Baker baker) {
		return bakerRepository.save(baker);
	}
	
	public boolean deleteBaker(Integer id) {
		try {
			bakerRepository.deleteById(id);
			return true;
		}catch(Exception err) {
			return false;
		}
	} 
}
