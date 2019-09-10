package com.example.employee.model;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;



@Entity
@Table(name="myemployee")
@EntityListeners(AuditingEntityListener.class)
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long  id;
	
	@NotBlank
	private String name;
	
	@NotBlank
	private String designation;
	
	@Column(nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createdAt;
	
	@Column(nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date modifiedAt;
	
	public Employee() {
	}

	public Employee(Long id, @NotBlank String name, @NotBlank String designation, Date createdAt, Date modifiedAt) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.createdAt = createdAt;
		this.modifiedAt = modifiedAt;
	}
	
}
