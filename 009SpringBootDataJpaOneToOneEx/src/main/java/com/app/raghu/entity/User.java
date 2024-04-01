package com.app.raghu.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="usertab")
public class User {
	
	@Id
	@Column(name="uid")
	private Integer usrId;
	@Column(name="uname")
	private String userName;
	@Column(name="upwd")
	private String userPwd;
	
	@OneToOne
	@JoinColumn
	private Profile pb;

}
