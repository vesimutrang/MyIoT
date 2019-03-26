package com.iot.controller;

import org.eclipse.paho.client.mqttv3.IMqttClient;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

public class MqttPublishSample {

	public static void main(String[] args) {

		String topic = "esp8266";
		String content = "Message from MqttPublishSample";
		int qos = 2;
		String broker = "tcp://127.0.0.1:1883";
		String clientId = "JavaSample";
		MemoryPersistence persistence = new MemoryPersistence();

		try {
			
			IMqttClient mqttClient = new MqttClient(broker, clientId, persistence);
			
			MqttConnectOptions options = new MqttConnectOptions();
			options.setAutomaticReconnect(true);
			options.setConnectionTimeout(10);
			
			mqttClient.connect(options);
			
			MqttMessage message = new MqttMessage(content.getBytes());
			message.setQos(qos);
			mqttClient.publish(topic, message);
			

			mqttClient.subscribe(topic);
			mqttClient.setCallback(new MqttCallback() {

				@Override
				public void messageArrived(String topic, MqttMessage message) throws Exception {
					System.out.println(message.toString());
				}

				@Override
				public void deliveryComplete(IMqttDeliveryToken token) {

				}

				@Override
				public void connectionLost(Throwable cause) {

				}
			});
//			sampleClient.disconnect();
//			System.out.println("Disconnected");
//			System.exit(0);
		} catch (MqttException me) {
			System.out.println("reason " + me.getReasonCode());
			System.out.println("msg " + me.getMessage());
			System.out.println("loc " + me.getLocalizedMessage());
			System.out.println("cause " + me.getCause());
			System.out.println("excep " + me);
			me.printStackTrace();
		}
	}
}