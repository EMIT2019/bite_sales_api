package com.emit.bite_sales.model;

import lombok.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "rol_employee")
public class RolEmployee implements ModelEntity {
	@Id
	@NotNull(message = "The primary key id_rol_employee can't be null")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_rol_employee", nullable = false)
	private int id_rol_employee;
	
	@NotNull(message = "The foreign key id_rol can't be null")
	@JoinColumn(name = "id_rol")
	@OneToOne
	private Rol rol;
	
	@NotNull(message = "The foreign key id_employee can't be null")
	@JoinColumn(name = "id_employee")
	@OneToOne
	private Employee employee;
}
