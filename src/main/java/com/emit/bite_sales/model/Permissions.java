package com.emit.bite_sales.model;

import lombok.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "permissions")
public class Permissions implements ModelEntity {
	@Id
	@NotNull(message = "The primary key id_permission can't be null")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_permission", nullable = false)
	private int id_permission;
	
	@NotEmpty(message = "The field permission_name can't be empty")
	@Size(max = 50)
	@Column(name = "permission_name", nullable = false)
	private String permission_name; 
	
	@NotEmpty(message = "The field permission_description can't be empty")
	@Size(max = 100)
	@Column(name = "permission_description", nullable = false)
	private String permission_description;
}
