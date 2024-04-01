package com.app.raghu.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="proftab")
public class Profile {
	@Id
	@Column(name="pid")
	private Integer prfId;
	@Column(name="acode")
	private boolean actCode;
	@Column(name="pdsg")
	private String desgination;

}
