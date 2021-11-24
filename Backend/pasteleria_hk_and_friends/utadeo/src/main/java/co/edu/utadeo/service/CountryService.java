package co.edu.utadeo.service;

import co.edu.utadeo.domain.Country;
import co.edu.utadeo.repository.CountryRepository;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CountryService extends EntityService<Country>{

	@Autowired
	CountryRepository countryRepository;
    CountryService(CountryRepository repository) {
        super(repository);
    }
    
    public ArrayList<Country> getCountry() {
		return (ArrayList<Country>) countryRepository.findAll();
	}
	
	public Country saveCountry(Country country) {
		return countryRepository.save(country);
	}
	
	@Override
	public void getForId(int id) {
	 countryRepository.findById(id);
	}
	
	public ArrayList<Country> getForName(int name) {
		return countryRepository.findByName(name);
	}
	
	
	@Override
	public void delete(int id) {
		countryRepository.deleteById(id);
	}
	
	
}
