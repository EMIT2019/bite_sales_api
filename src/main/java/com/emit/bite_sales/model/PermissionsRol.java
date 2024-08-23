package com.emit.bite_sales.model;

import lombok.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "permissions_rol")
public class PermissionsRol implements ModelEntity {
	@Id
	@NotNull(message = "The primary key id_permissions_rol can't be null")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_permissions_rol", nullable = false)
	private int id_permissions_rol;
	
	@NotNull(message = "The field id_permission can't be null")
	@JoinColumn(name = "id_permission")
	@OneToOne
	private Permissions permission;
	
	@NotNull(message = "The field id_rol can't be null")
	@JoinColumn(name = "id_rol")
	@OneToOne
	private Rol rol;
}
