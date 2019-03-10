package org.kotliner.springcloud.service.bar.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class BarService {

    @Value("${service.name}")
    private String name;

    @HystrixCommand
    public String getBarName() {
        try {
            TimeUnit.MILLISECONDS.sleep(11000);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
        return name;
    }

}
