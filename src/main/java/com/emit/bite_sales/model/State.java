package com.emit.bite_sales.model;

import lombok.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "state")
public class State implements ModelEntity {
	@Id
	@NotNull(message = "The primary key field id_state can't be null")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_state", nullable = false)
	private int id_state;
	
	@NotNull(message = "The field id_country can't be null")
	@JoinColumn(name = "id_country")
	@OneToOne
	private Country country;
	
	@NotEmpty(message = "The field state_name can't be empty")
	@Size(max = 30)
	@Column(name = "state_name", nullable = false)
	private String state_name;
}
