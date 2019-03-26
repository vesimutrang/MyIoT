package com.iot.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ActuatorSchedule {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long actuatorScheduleId;

	private Date date;
	/*
	 * @ngay : HH:mm:ss
	 * 
	 * @thu : thu:HH:mm:ss
	 * 
	 */
	private Date repeatDate;
	private Date startDate;
	private Date endDate;
	private boolean isActive;
	private int status;
}
