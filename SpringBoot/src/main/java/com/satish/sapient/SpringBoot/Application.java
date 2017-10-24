package com.satish.sapient.SpringBoot;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Application {
	
	 @Bean
	    public ConnectionFactory connectionFactory() {
	        return new CachingConnectionFactory("localhost");
	    }

	    @Bean
	    public AmqpAdmin amqpAdmin() {
	        return new RabbitAdmin(connectionFactory());
	    }

	    @Bean
	    public RabbitTemplate rabbitTemplate() {

	        // updated with @GaryRussels feedback
	        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory());
	        rabbitTemplate.setMessageConverter(new Jackson2JsonMessageConverter());
	        return rabbitTemplate;
	    }

	    @Bean
	    public Queue myQueue() {
	        return new Queue("AddTrade");
	    }

}
