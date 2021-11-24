package co.edu.utadeo.service;

import co.edu.utadeo.domain.ExternalPerson;
import co.edu.utadeo.repository.ExternalPersonRepository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExternalPersonService extends EntityService<ExternalPerson> {

	@Autowired
	ExternalPersonRepository externalPersonRepository;
	ExternalPersonService(ExternalPersonRepository repository) {
        super(repository);
    }
	
	  public ArrayList<ExternalPerson> getExternalPerson() {
			return (ArrayList<ExternalPerson>) externalPersonRepository.findAll();
		}
		
		public ExternalPerson saveExternalPerson(ExternalPerson externalPerson) {
			return externalPersonRepository.save(externalPerson);
		}
		
		@Override
		public void getForId(int id) {
			externalPersonRepository.findById(id);
		}
		
		public ArrayList<ExternalPerson> getForName(int name) {
			return externalPersonRepository.findByName(name);
		}
		
		
		@Override
		public void delete(int id) {
			externalPersonRepository.deleteById(id);
		}
}
