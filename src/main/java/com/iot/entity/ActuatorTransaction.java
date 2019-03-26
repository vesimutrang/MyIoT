package com.iot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class ActuatorTransaction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long actuatorTransactionId;

	@OneToOne
	@JoinColumn(name = "actuatorId")
	private Actuator actuator;
	
	@OneToOne
	@JoinColumn(name = "actuatorActionId")
	private ActuatorAction actuatorAction;
	
	@OneToOne
	@JoinColumn(name = "actuatorScheduleId")
	private ActuatorSchedule actuatorSchedule;
	
	
}
