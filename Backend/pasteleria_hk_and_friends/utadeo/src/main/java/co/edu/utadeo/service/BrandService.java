package co.edu.utadeo.service;

import co.edu.utadeo.domain.Brand;
import co.edu.utadeo.repository.BrandRepository;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandService extends EntityService<Brand> {

	@Autowired
	BrandRepository brandRepository;
	BrandService(BrandRepository repository) {
        super(repository);
    }
	
	public ArrayList<Brand> getBrand() {
		return (ArrayList<Brand>) brandRepository.findAll();
	}
	
	public Brand saveBrand(Brand brand) {
		return brandRepository.save(brand);
	}
	
	@Override
	public void getForId(int id) {
	 brandRepository.findById(id);
	}
	
	/*public Optional<Brand> getForId(Integer id) {
		return brandRepository.findById(id);
	}*/
	
	public ArrayList<Brand> getForName(Integer name) {
		return brandRepository.findByName(name);
	}
	
	public boolean deleteBrand(Integer id) {
		try {
			brandRepository.deleteById(id);
			return true;
		}catch(Exception err) {
			return false;
		}
	} 
}
