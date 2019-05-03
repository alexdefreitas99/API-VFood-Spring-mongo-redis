package com.viaflow.vfood.rabbit;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import org.springframework.stereotype.Service;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

@Service
public class RabbitService {

	public RabbitModel put(String message) {
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost(RabbitConstains.HOST);
		try {
			Connection connection = factory.newConnection();
			Channel channel = connection.createChannel();
			channel.queueDeclare(RabbitConstains.QUEUE_NAME, true, false, false, null);
			channel.basicPublish("", RabbitConstains.QUEUE_NAME, null, message.getBytes("UTF-8"));
			channel.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public RabbitModel find() {
		RabbitModel rabbitModel = new RabbitModel();
		try {
			ConnectionFactory factory = new ConnectionFactory();
			factory.setHost(RabbitConstains.HOST);
			Connection connection = factory.newConnection();
			Channel channel = connection.createChannel();
			channel.queueDeclare(RabbitConstains.QUEUE_NAME, true, false, false, null);
			DeliverCallback deliverCallback = (consumerTag, delivery) -> {
				rabbitModel.setMessage(new String(delivery.getBody(), "UTF-8")); 
			};
			channel.basicConsume(RabbitConstains.QUEUE_NAME, true, deliverCallback, consumerTag -> {
			});
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
		return rabbitModel;
	}
}
