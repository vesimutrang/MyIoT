package com.iot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ActuatorAction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long actuatorActionId;
	@Column(name = "conditions")
	private String condition;

}
