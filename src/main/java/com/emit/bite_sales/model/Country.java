package com.emit.bite_sales.model;

import lombok.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "country")
public class Country implements ModelEntity {
	@Id
	@NotNull(message = "The primary key field id_country can't be null")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_country", nullable = false)
	private int id_country;
	
	@NotNull(message = "The field id_region can't be null.")
	@JoinColumn(name = "id_region")
	@OneToOne
	private Region region;
	
	@NotEmpty(message = "The field country_name must not be empty.")
	@Size(max = 30)
	@Column(name = "country_name", nullable = false)
	private String country_name;
}
