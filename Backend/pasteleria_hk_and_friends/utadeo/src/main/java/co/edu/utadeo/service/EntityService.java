package co.edu.utadeo.service;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.utadeo.domain.Country;
import co.edu.utadeo.domain.Employee;

import java.util.List;
import java.util.Optional;

public abstract class EntityService<T> {

    JpaRepository<T, Integer> repository;

    EntityService(JpaRepository repository){
        this.repository = repository;
    }

    public List<T> getAll(){
        return repository.findAll();
    }

    public T getOne(Integer id){
        Optional<T> entity = repository.findById(id);
        if(!entity.isPresent()){
            return null;
        }
        return entity.get();
    }

    public T save(T entity){
        return repository.save(entity);
    }

   	public void delete(int id) {
		repository.deleteById(id);
		
	}

	public void getForId(int id) {
		 repository.findById(id);
	}

}
