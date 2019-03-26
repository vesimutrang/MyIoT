package com.iot.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class SensorDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long sensorDetailId;
	private double data;
	private Date date;

	@ManyToOne
	@JoinColumn(name = "sensorId")
	private Sensor sensor;
}
