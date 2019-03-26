package com.iot.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Sensor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long sensorId;
	private String name;
	private Date dateCreated;

	@OneToMany
	@JoinColumn(name = "sensorId", insertable = false, updatable = false)
	private List<ActuatorAction> actuatorActions;

}
