package com.emit.bite_sales.model;

import lombok.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Getter
@Setter
@ToString
@Entity
@Table(name =  "region")
public class Region implements ModelEntity {
	@Id
	@NotNull(message = "The primary key field id_region can't be null.")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_region", nullable = false)
	private int id_region;
	
	@NotEmpty(message = "The field key must not be empty")
	@Size(max = 30)
	@Column(name = "region_name", nullable = false)
	private String region_name;
}
