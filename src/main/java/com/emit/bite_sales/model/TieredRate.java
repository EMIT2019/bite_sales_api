package com.emit.bite_sales.model;

import lombok.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "tiered_rate")
public class TieredRate implements ModelEntity {
	@Id
	@NotNull(message = "The primary key field id_tiered_rate can't be null")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tiered_rate", nullable = false)
	private int id_tiered_rate;
	
	@NotNull(message = "The foerign key id_rate_type can't be null")
	@JoinColumn(name = "id_rate_type")
	@OneToOne
	private RateType rate_type;
	
	@NotNull(message = "The field min_range can't be empty")
	@Column(name = "min_range", nullable = false)
	private double min_range;
	
	@NotNull(message = "The field max_range can't be null")
	@Column(name = "max_range", nullable = false)
	private double max_range;
	
	@NotNull(message = "The field percentage can't be null")
	@Column(name = "percentage", nullable = false)
	private double percentage;
}
