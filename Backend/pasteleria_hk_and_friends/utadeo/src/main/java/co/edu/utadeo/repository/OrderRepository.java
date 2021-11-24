package co.edu.utadeo.repository;

import co.edu.utadeo.domain.Order;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
