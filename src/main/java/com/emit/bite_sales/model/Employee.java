package com.emit.bite_sales.model;

import lombok.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "employee")
public class Employee implements ModelEntity {
	@Id
	@NotNull(message = "The primary key id_employee can't be null")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_employee", nullable = false)
	private int id_employee;
	
	@NotNull(message = "The foreign key id_company can't be null")
	@JoinColumn(name = "id_company")
	@OneToOne
	private Company company;
	
	@NotEmpty(message = "The field employee_name can't be empty")
	@Size(max = 30)
	@Column(name = "employee_name", nullable = false)
	private String employee_name;
	
	@NotEmpty(message = "The field employee_lastname can't be empty")
	@Size(max = 30)
	@Column(name = "employee_lastname", nullable = false)
	private String employee_lastname;
	
	@NotEmpty(message = "The field employee_job_id can't be empty")
	@Size(max = 30)
	@Column(name = "employee_job_id", nullable = false)
	private String employee_job_id;
	
	@NotEmpty(message = "The field citizen_id can't be empty")
	@Size(max = 30)
	@Column(name = "citizen_id", nullable = false)
	private String citizen_id;
	
	@NotEmpty(message = "The field employee_email can't be empty")
	@Size(max = 50)
	@Column(name = "employee_email", nullable = false)
	private String employee_email;
	
	@NotEmpty(message = "The field employee_phone can't be empty")
	@Size(max = 20)
	@Column(name = "employee_phone", nullable = false)
	private String employee_phone;
}
