package co.edu.utadeo.service;

import co.edu.utadeo.domain.Ingredient;
import co.edu.utadeo.repository.IngredientRepository;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class IngredientService extends EntityService<Ingredient> {


	IngredientService(IngredientRepository repository) {
        super(repository);
    }

    public ArrayList<Ingredient> getIngredient() {
		return (ArrayList<Ingredient>) repository.findAll();
	}
	
	public Ingredient saveIngredient(Ingredient ingredient) {
		return repository.save(ingredient);
	} 
	
	@Override
	public void getForId(int id) {
		repository.findById(id);
	}
		
	
	@Override
	public void delete(int id) {
		repository.deleteById(id);
	}
	
}
