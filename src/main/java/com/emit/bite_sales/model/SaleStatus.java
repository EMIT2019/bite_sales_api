package com.emit.bite_sales.model;

import lombok.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "sale_status")
public class SaleStatus implements ModelEntity {
	@Id
	@NotNull(message = "The primary key id_sale_status can't be null")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_sale_status", nullable = false)
	private int id_sale_status;
	
	@NotNull(message = "The field sale_status can't be null")
	@Column(name = "sale_status", nullable = false)
	private boolean sale_status;
}
