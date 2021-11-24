package co.edu.utadeo.service;


import co.edu.utadeo.domain.Warehouse;
import co.edu.utadeo.repository.WarehouseRepository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WarehouseService extends EntityService<Warehouse> {

	@Autowired
	WarehouseRepository warehouseRepository;
    WarehouseService(WarehouseRepository repository) {
        super(repository);
    }
    
    public ArrayList<Warehouse> getWarehouse() {
		return (ArrayList<Warehouse>) warehouseRepository.findAll();
	}
	
	public Warehouse saveWarehouse(Warehouse warehouse) {
		return warehouseRepository.save(warehouse);
	}
	
	@Override
	public void getForId(int id) {
	 warehouseRepository.findById(id);
	}
	
	public ArrayList<Warehouse> getForName(int name) {
		return warehouseRepository.findByName(name);
	}
}
