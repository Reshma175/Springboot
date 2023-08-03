package Crus_Springboot.CrudSpringboot.controller;

import Crus_Springboot.CrudSpringboot.exception.OutOfStack;
import Crus_Springboot.CrudSpringboot.model.Order;
import Crus_Springboot.CrudSpringboot.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class ProdController {
    @Autowired
    private ProductRepo productRepo;

    @GetMapping
    public List<Order> getAllOrder() {
        return productRepo.findAll();
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return productRepo.save(order);
    }

    @GetMapping("{id}")
    public ResponseEntity<Order> getProductId(@PathVariable long id) {
        Order order = productRepo.findById(id)
                .orElseThrow(() -> new OutOfStack("Employee not exist with id :" + id));
        return ResponseEntity.ok(order);
    }

    @PutMapping("{id}")
    public ResponseEntity<Order> updateProduct(@PathVariable long id, @RequestBody Order productDetails) {
        Order updateProduct = productRepo.findById(id)
                .orElseThrow(() -> new OutOfStack("Employee not exist with id :" + id));
        updateProduct.setProduct_Name(productDetails.getProduct_Name());
        updateProduct.setDescription(productDetails.getDescription());
        updateProduct.setQuantity(productDetails.getQuantity());

        productRepo.save(updateProduct);

        return ResponseEntity.ok(updateProduct);

    }


    @DeleteMapping("{id}")
    public ResponseEntity<Order> deleteProduct(@PathVariable long id) {
        Order order = productRepo.findById(id)
                .orElseThrow(() -> new OutOfStack("Employee does not exist with id" + id));
        productRepo.delete(order);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
}