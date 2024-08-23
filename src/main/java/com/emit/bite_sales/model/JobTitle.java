package com.emit.bite_sales.model;

import lombok.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "job_title")
public class JobTitle implements ModelEntity {
	@Id
	@NotNull(message = "The primary key id_job_title can't be null")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_job_title", nullable = false)
	private int id_job_title;
	
	@NotEmpty(message = "The field job_title_name can't be empty")
	@Size(max = 30)
	@Column(name = "job_title_name", nullable = false)
	private String job_title_name;
	
	@NotEmpty(message = "The field job_description can't be empty")
	@Size(max = 30)
	@Column(name = "job_description", nullable = false)
	private String job_description;
}
