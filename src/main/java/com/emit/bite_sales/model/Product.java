package com.emit.bite_sales.model;

import lombok.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "product")
public class Product implements ModelEntity {
	@Id
	@NotNull(message = "The primary key id_product can't be null")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_product", nullable = false)
	private int id_product;
	
	@NotEmpty(message = "The field product_name can't be empty")
	@Size(max = 30)
	@Column(name = "product_name", nullable = false)
	private String product_name;
	
	@NotEmpty(message = "The field product_description can't be empty")
	@Size(max = 30)
	@Column(name = "product_description", nullable = false)
	private String product_description;
}
