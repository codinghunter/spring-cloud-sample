package org.kotliner.springcloud.service.foo.resource;

import org.kotliner.springcloud.service.foo.service.BarService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooResource {

    @Value("${service.name}")
    private String name;

    private final BarService barService;

    public FooResource(BarService barService) {
        this.barService = barService;
    }

    @GetMapping("/foo/name")
    public String fooName() {
        return name;
    }

    @GetMapping("/bar/name")
    public String barName() {
        return barService.getBarName();
    }


}
