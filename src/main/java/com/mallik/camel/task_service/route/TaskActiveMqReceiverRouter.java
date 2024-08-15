package com.mallik.camel.task_service.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class TaskActiveMqReceiverRouter extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("activemq:active-mq-queue")
		.log("log:received message-from-active-mq: ${body}");
		
	}

}
