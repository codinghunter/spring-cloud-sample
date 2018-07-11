package org.kotliner.springcloud.service.bar.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BarResource {

    @Value("${service.name}")
    private String name;

    @GetMapping("/bar/name")
    public String barName() {
        return name;
    }

}
