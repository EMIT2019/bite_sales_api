package com.emit.bite_sales.model;

import lombok.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "rate_type")
public class RateType implements ModelEntity {
	@Id
	@NotNull(message = "The primary key field id_rate_type can't be null")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_rate_type", nullable = false)
	private int id_rate_type;
	
	@NotEmpty(message = "The field rate_name can't be empty")
	@Size(max = 30)
	@Column(name = "rate_name", nullable = false)
	private String rate_name;
}

