package co.edu.utadeo.rest;

import co.edu.utadeo.domain.Order;
import co.edu.utadeo.service.OrderService;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrderController extends EntityController<Order>{

	@Autowired
	OrderService orderService;
    OrderController(OrderService service) {
        super(service);
    }
    
    @GetMapping("/order")
   	public ArrayList<Order> getOrder() {
   	   return orderService.getOrder();
   	}
    
    @GetMapping("/order/{id}")
    public Order getOrderOne(@PathVariable(value="id") int id) {
		return orderService.getOne(id);    	
    }
    
    @PostMapping("/order")
    public Order save (@RequestBody Order order ){
        return service.save(order);
    }

    @DeleteMapping("/order/delete/{id}")
    public String deleteOrder(Model model, @PathVariable int id) {
    	orderService.delete(id);
    	return "redirect:/order";
    }
    
    @PutMapping("/order")
    public Order putOrder(@RequestBody Order order) {
    	return orderService.save(order);
    }
   
}
