package co.edu.utadeo.service;

import co.edu.utadeo.domain.Stage;
import co.edu.utadeo.repository.StageRepository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StageService extends EntityService<StageService>{

	@Autowired
	StageRepository stageRepository;
    StageService(StageRepository repository) {
        super(repository);
    }
	
    public ArrayList<Stage> getStage() {
		return (ArrayList<Stage>) stageRepository.findAll();
	}
	
	public Stage saveStage(Stage stage) {
		return stageRepository.save(stage);
	}
	
	@Override
	public void getForId(int id) {
	 stageRepository.findById(id);
	}
	
	public ArrayList<Stage> getForName(int name) {
		return stageRepository.findByName(name);
	}
		
	@Override
	public void delete(int id) {
		stageRepository.deleteById(id);
	}
	
	
}
