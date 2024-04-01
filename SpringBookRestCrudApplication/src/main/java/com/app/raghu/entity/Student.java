package com.app.raghu.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="stdtab")
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sid")
	private Integer stdId;
	@Column(name="sname")
	@NotBlank(message="Must ener any one name")
	private String stdName;
	@Column(name="sgen")
	private String stdGen;
	@Column(name="scourse")
	private String stdCourse;
	@Column(name="saddr")
	@NotBlank
	@Pattern(regexp="[A-Za-z0-9\\.\\&\\?\\-\\,]{10,200}")
	private String stdAddr;

}
