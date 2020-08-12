package com.ozz.springcloud.provider.component.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

@Component
public class MyHealthIndicator implements HealthIndicator {

  public Health health() {
    return new Health.Builder(Status.UP).build();
  }

}