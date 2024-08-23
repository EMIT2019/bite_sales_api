package com.emit.bite_sales.model;

import lombok.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "company")
public class Company implements ModelEntity {
	@Id
	@NotNull(message = "The primary key id_company can't be null")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_company", nullable = false)
	private int id_company;
	
	@NotNull(message = "The field id_state can't be null")
	@JoinColumn(name = "id_state")
	@OneToOne
	private State state;
	
	@NotEmpty(message = "The field company_name can't be empty")
	@Size(max = 100)
	@Column(name = "company_name", nullable = false)
	private String company_name;
	
	@NotEmpty(message = "The field ruc_number can't be empty")
	@Size(max = 14)
	@Column(name = "ruc_number")
	private String ruc_number;
	
	@NotEmpty(message = "The field ein_number can't be empty")
	@Size(max = 9)
	@Column(name = "ein_number")
	private String ein_number;
	
	@NotEmpty(message = "The field company_email can't be empty")
	@Size(max = 50)
	@Column(name = "company_email")
	private String company_email;
	
	@NotEmpty(message = "The field company_phone can't be empty")
	@Size(max = 20)
	@Column(name = "company_phone")
	private String company_phone;
	
	@NotEmpty(message = "The field company_logo can't be empty")
	@Size(max = 150)
	@Column(name = "company_logo")
	private String company_logo;
}
