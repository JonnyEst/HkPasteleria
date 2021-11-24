package co.edu.utadeo.service;

import co.edu.utadeo.domain.Company;
import co.edu.utadeo.repository.CompanyRepository;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService extends EntityService<Company> {

	@Autowired
	CompanyRepository companyRepository;
    CompanyService(CompanyRepository repository) {
        super(repository);
    }
    
    public ArrayList<Company> getCompany() {
		return (ArrayList<Company>) companyRepository.findAll();
	}
	
	public Company saveCompany(Company company) {
		return companyRepository.save(company);
	}
	
	public Optional<Company> getForId(Integer id) {
		return companyRepository.findById(id);
	}
	
	public ArrayList<Company> getForName(Integer name) {
		return companyRepository.findByName(name);
	}
	
	@Override
	public void delete(int id) {
		companyRepository.deleteById(id);
	} 
}
