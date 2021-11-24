package co.edu.utadeo.service;

import co.edu.utadeo.domain.Oven;
import co.edu.utadeo.repository.OvenRepository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OvenService extends EntityService<Oven> {

	@Autowired
	OvenRepository ovenRepository;
	OvenService(OvenRepository repository) {
        super(repository);
    }
	
    public ArrayList<Oven> getOven() {
		return (ArrayList<Oven>) ovenRepository.findAll();
	}
	
	public Oven saveOven(Oven oven) {
		return ovenRepository.save(oven);
	}
	
	@Override
	public void getForId(int id) {
		ovenRepository.findById(id);
	}
	
	
	
	@Override
	public void delete(int id) {
		ovenRepository.deleteById(id);
	}
}
