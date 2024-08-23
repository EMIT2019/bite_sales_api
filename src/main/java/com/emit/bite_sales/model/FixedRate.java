package com.emit.bite_sales.model;

import lombok.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "fixed_rate")
public class FixedRate implements ModelEntity {
	@Id
	@NotNull(message = "The primary key field id_fixed_rate can't be null")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_fixed_rate", nullable = false)
	private int id_fixed_rate;
	
	@NotNull(message = "The field id_rate_type can't be null")
	@JoinColumn(name = "id_rate_type")
	@OneToOne
	private RateType rate_type;
	
	@NotNull(message = "The field percentage can't be null")
	@Column(name = "percentage")
	private double percentage;
}
