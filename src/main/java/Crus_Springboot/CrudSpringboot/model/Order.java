package Crus_Springboot.CrudSpringboot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Products")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long product_id;

    @Column(name="product_name")
    private String Product_Name;

    @Column(name="Description_product")
    private String Description;

    @Column(name="quantity")
    private int quantity;


}
