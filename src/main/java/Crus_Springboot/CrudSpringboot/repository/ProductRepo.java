package Crus_Springboot.CrudSpringboot.repository;

import Crus_Springboot.CrudSpringboot.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ProductRepo extends JpaRepository<Order, Long> {


}
