package co.edu.utadeo.service;

import co.edu.utadeo.domain.Order;
import co.edu.utadeo.repository.OrderRepository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService extends EntityService<Order> {

	@Autowired
	OrderRepository orderRepository;
    OrderService(OrderRepository repository) {
        super(repository);
    }
    
    public ArrayList<Order> getOrder() {
		return (ArrayList<Order>) orderRepository.findAll();
	}
	
	public Order saveCountry(Order order) {
		return orderRepository.save(order);
	}
	
	@Override
	public void getForId(int id) {
		orderRepository.findById(id);
	}
	

	
	
	@Override
	public void delete(int id) {
		orderRepository.deleteById(id);
	}
    
    
}
