package com.ozz.springcloud.provider.component.health;

import com.netflix.appinfo.HealthCheckHandler;
import com.netflix.appinfo.InstanceInfo.InstanceStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

@Component
public class MyHealthCheckHandler implements HealthCheckHandler {

	@Autowired
	private MyHealthIndicator halthIndicator;
	
	public InstanceStatus getStatus(InstanceStatus currentStatus) {
		Status status = halthIndicator.health().getStatus();
		if(status.equals(Status.UP)) {
			return InstanceStatus.UP;
		} else {
			return InstanceStatus.DOWN;
		}
	}

}