package com.iot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Actuator {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long actuatorId;
	private String name;

	@ManyToOne
	@JoinColumn(name = "deviceId")
	private Device device;

}
