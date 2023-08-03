package Crus_Springboot.CrudSpringboot;

import Crus_Springboot.CrudSpringboot.model.Order;
import Crus_Springboot.CrudSpringboot.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudSpringbootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringbootApplication.class, args);
		System.out.println("Hello");
	}

	@Autowired
	private ProductRepo productRepo;
	@Override
	public void run(String... args) throws Exception {

		Order order = new Order();
		order.setProduct_id(1);
		order.setProduct_Name("Oil");
		order.setDescription("Refinery eatable oil");
		order.setQuantity(1);
		productRepo.save(order);

		Order order1 = new Order();
		order1.setProduct_id(2);
		order1.setProduct_Name("Shampoo");
		order1.setDescription("External Use only");
		order1.setQuantity(1);
		productRepo.save(order1);

		Order order2 = new Order();
		order2.setProduct_id(3);
		order2.setProduct_Name("Toothpaste");
		order2.setDescription("Herbal ingridients only");
		order2.setQuantity(4);
		productRepo.save(order2);

	}
}
