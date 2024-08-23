package com.emit.bite_sales.model;

import lombok.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "rol")
public class Rol implements ModelEntity {
	@Id
	@NotNull(message = "The primary key id_rol can't be null")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_rol", nullable = false)
	private int id_rol;
	
	@NotEmpty(message = "The field rol_name can't be empty")
	@Size(max = 50)
	@Column(name = "rol_name", nullable = false)
	private String rol_name;
}
