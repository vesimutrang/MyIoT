package com.iot.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Device {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long deviceId;
	private String name;
	
	@OneToMany
	@JoinColumn(name = "sensorId", updatable = false, insertable = false)
	private List<Sensor> sensors;
	
	@OneToMany
	@JoinColumn(name = "actuatorId", updatable = false, insertable = false)
	private List<Actuator> actuators;

}
